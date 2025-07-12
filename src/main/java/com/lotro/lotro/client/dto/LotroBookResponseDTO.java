package com.lotro.lotro.client.dto;

import com.lotro.lotro.dto.LotroBookDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LotroBookResponseDTO {

    private List<LotroBookDTO> docs;

    private int total;
    private int limit;
    private int offset;
    private int page;
    private int pages;
}
