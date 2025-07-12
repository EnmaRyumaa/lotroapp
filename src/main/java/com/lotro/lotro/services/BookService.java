package com.lotro.lotro.services;

import com.lotro.lotro.client.LotroBookApiClient;
import com.lotro.lotro.client.dto.LotroBookResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    public Mono<ResponseEntity<LotroBookResponseDTO>> getBooks() {
        return LotroBookApiClient.makeRequest();
                /*.map(responseEntity -> {
                    var response = responseEntity.getBody();
                    return new LotroBookDTO(response.getDocs());
                });*/
    }

}
