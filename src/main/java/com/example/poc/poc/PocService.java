package com.example.poc.poc;

import com.example.poc.common.client.GenshinClient;
import com.example.poc.poc.dto.TypesDTO;
import com.example.poc.poc.mapper.PocMapper;
import reactor.core.publisher.Mono;
public class PocService {
    private final GenshinClient genshinClient = new GenshinClient();
    private final PocMapper pocMapper = new PocMapper();

    /*
        This is a proof of concept in the service in which we would ultimately:
        1. Call the client to the downstream call
        2. Map the DTO we get from the downstream call to a model
        3. We can now do any modifications to the model and map what we want in the response back to a
        DTO to transfer back that data to a possible upstream call.

        In the below example:
        1. We receive TypesDTO from the downstream client.
        2. We then map the TypesDTO to our model Types.
            2a. We can now do any business logic with the data.
        3. We map our final model Types to an outgoing TypesDTO.
            3a. Types could possibly be called upstream.
     */
    public Mono<TypesDTO> getTypes(){
        return genshinClient.getTypes()
                .map(pocMapper::toTypes)
                .map(pocMapper::toTypesDTO);
    }
}
