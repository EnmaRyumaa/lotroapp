package com.lotro.lotro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LotroBookDTO {

    @JsonProperty("_id")
    private Object id;

    private String name;

    public LotroBookDTO (List<LotroBookDTO> docs) {
        for (LotroBookDTO lotroBookDTO : docs) {
            this.id = lotroBookDTO.getId();
            this.name = lotroBookDTO.getName();
        }
    }

}
