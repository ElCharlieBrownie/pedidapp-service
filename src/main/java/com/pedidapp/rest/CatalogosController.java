package com.pedidapp.rest;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatalogosController {

    public List<String> getCatalogo(){
        return new ArrayList();
    }
}
