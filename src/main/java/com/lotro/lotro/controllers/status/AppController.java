package com.lotro.lotro.controllers.status;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping(value = "/ping")
public class AppController {

    @GetMapping
    public ResponseEntity<Map<String, String>> ping() {
        Map<String, String> rs = new HashMap<String, String>();
        rs.put("Status", "OK");
        return ResponseEntity.ok(rs);
    }
}
