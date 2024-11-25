package com.pedidapp.repository;


import com.pedidapp.domain.entity.Figuras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FigurasRepository extends JpaRepository<Figuras, Long> {


}
