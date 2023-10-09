package com.example.poc.client.genshin;


import org.springframework.web.reactive.function.client.WebClient;

public class GenshinClient {
    WebClient.Builder genshinWebClient = WebClient.builder();

    public WebClient getTypes(){
        return genshinWebClient
                .baseUrl("https://api.genshin.dev")
                .build();
    }
}