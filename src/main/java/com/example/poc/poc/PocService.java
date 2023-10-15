package com.example.poc.poc;

import com.example.poc.common.client.GenshinClient;
import com.example.poc.poc.mapper.PocMapper;
import com.example.poc.poc.model.Types;
import reactor.core.publisher.Mono;
public class PocService {
    private final GenshinClient genshinClient = new GenshinClient();
    private final PocMapper pocMapper = new PocMapper();
    public Mono<Types> getTypes(){
        return genshinClient.getTypes()
                .map(pocMapper::toTypes);
    }
}
