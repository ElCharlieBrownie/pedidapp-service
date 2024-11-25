package com.pedidapp.domain.entity;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Catalogo {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

}
