package com.beto.demo.infrastructure.repository;


import com.beto.demo.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositoty extends JpaRepository<Endereco, Long> {
}
