package com.motogp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motogp.model.entities.Circuito;

public interface ICircuito extends JpaRepository<Circuito, Integer> {
    
}
