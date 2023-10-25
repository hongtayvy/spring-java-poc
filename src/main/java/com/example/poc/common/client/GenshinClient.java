package com.example.poc.common.client;


import com.example.poc.common.client.dto.TypesDTO;
import com.example.poc.common.error.CustomError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GenshinClient {
    Logger logger = LoggerFactory.getLogger(GenshinClient.class);

    WebClient.Builder genshinWebClient = WebClient.builder();

    public WebClient getGenshinWebClient(){
        logger.info("Building out webclient");
        return genshinWebClient
                .baseUrl("https://api.genshin.dev")
                .build();
    }

    public Mono<TypesDTO> getTypes(){
        logger.info("Connecting to webclient");
        return getGenshinWebClient()
                .get()
                .retrieve()
                .bodyToMono(TypesDTO.class)
                .onErrorResume(e -> Mono.error(new CustomError(
                        HttpStatus.BAD_REQUEST,
                        "username is required", e).getBody()));
    }
}