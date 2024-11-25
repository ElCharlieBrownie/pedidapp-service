package com.pedidapp.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Figuras extends Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
