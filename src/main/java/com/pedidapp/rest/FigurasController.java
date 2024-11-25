package com.pedidapp.rest;


import com.pedidapp.domain.entity.Figuras;
import com.pedidapp.service.FigurasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FigurasController {

    private final FigurasService figurasService;

    public FigurasController(FigurasService figurasService) {
        this.figurasService = figurasService;
    }

    @GetMapping("/figuras")
    public List<Figuras> getFiguras() {
        return figurasService.findAll();
    }
}
