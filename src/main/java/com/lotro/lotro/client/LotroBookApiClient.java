package com.lotro.lotro.client;

import com.lotro.lotro.client.dto.LotroBookResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class LotroBookApiClient {

    //TODO Insert uri api inside on db, and recover using properties.

    public static Mono<ResponseEntity<LotroBookResponseDTO>> makeRequest() {
        WebClient api = WebClient.create("https://the-one-api.dev/v2");

        Mono<ResponseEntity<LotroBookResponseDTO>> app = api.get()
                .uri("/book")
                .accept(MediaType.ALL)
                .retrieve()
                .toEntity(LotroBookResponseDTO.class);

        return app;
    }
}
