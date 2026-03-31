package com.beto.demo.infrastructure.repository;


import com.beto.demo.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepositoty extends JpaRepository<Telefone, Long> {
}
