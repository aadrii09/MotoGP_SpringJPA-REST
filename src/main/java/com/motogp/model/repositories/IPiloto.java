package com.motogp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motogp.model.entities.Piloto;

public interface IPiloto extends JpaRepository <Piloto, Integer> {
    
}