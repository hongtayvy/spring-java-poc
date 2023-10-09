package com.example.poc.poc;

import com.example.poc.client.genshin.GenshinClient;
import com.example.poc.client.genshin.dto.TypesDTO;
import com.example.poc.poc.mapper.PocMapper;
import com.example.poc.poc.model.Types;
import reactor.core.publisher.Mono;
public class PocService {
    private final GenshinClient genshinClient = new GenshinClient();
    private final PocMapper pocMapper = new PocMapper();
    public Mono<Types> getTypes(){
        Mono<TypesDTO> typesDTO = genshinClient.getTypes()
                .get()
                .retrieve()
                .bodyToMono(TypesDTO.class)
                .onErrorResume(body -> Mono.empty());
        return typesDTO.map(pocMapper::toTypes);

    }
}
