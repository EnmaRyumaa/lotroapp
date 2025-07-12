package com.lotro.lotro.controllers;

import com.lotro.lotro.client.dto.LotroBookResponseDTO;
import com.lotro.lotro.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v2")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping(value = "/books")
    public Mono<ResponseEntity<LotroBookResponseDTO>> getBooks() {
        return service.getBooks();
    }
}
