package com.pedidapp.service;


import com.pedidapp.domain.entity.Figuras;
import com.pedidapp.exception.NotFoundException;
import com.pedidapp.repository.FigurasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FigurasService {

    private final FigurasRepository figurasRepository;

    public FigurasService(FigurasRepository figurasRepository) {
        this.figurasRepository = figurasRepository;
    }

    public Figuras create(Figuras figura) {
        return figurasRepository.save(figura);
    }

    public Figuras findOne(Long userId) {
        return figurasRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("User of id " + userId + " not found."));
    }

    public List<Figuras> findAll() {
        return figurasRepository.findAll();
    }

    public Figuras update(Long userId, Figuras figuras) {
        Figuras foundfigura = findOne(userId);
        foundfigura.setNombre(figuras.getNombre());
        foundfigura.setDescripcion(figuras.getDescripcion());
        figurasRepository.save(foundfigura);
        return foundfigura;
    }

    public void delete(Long id) {
        figurasRepository.deleteById(id);
    }
}
