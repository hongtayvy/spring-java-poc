package com.example.poc.poc;

import com.example.poc.common.client.GenshinClient;
import com.example.poc.poc.dto.TypesDTO;
import com.example.poc.poc.mapper.PocMapper;
import reactor.core.publisher.Mono;
public class PocService {
    private final GenshinClient genshinClient = new GenshinClient();
    private final PocMapper pocMapper = new PocMapper();
    public Mono<TypesDTO> getTypes(){
        return genshinClient.getTypes()
                .map(pocMapper::toTypes)
                .map(pocMapper::toTypesDTO);
    }
}
