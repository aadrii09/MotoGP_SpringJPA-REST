package com.motogp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motogp.model.entities.Carrera;

public interface ICarrera extends JpaRepository <Carrera, Integer> {

}
