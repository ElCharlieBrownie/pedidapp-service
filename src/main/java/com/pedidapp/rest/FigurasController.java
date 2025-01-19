package com.pedidapp.rest;


import com.pedidapp.domain.entity.Figuras;
import com.pedidapp.service.FigurasService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/figura")
    public @ResponseBody Figuras createFigura(@RequestBody Figuras figura) {
        return figurasService.create(figura);
    }
}
