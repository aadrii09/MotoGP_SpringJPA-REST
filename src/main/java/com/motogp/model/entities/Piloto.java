package com.motogp.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pilotos")
public class Piloto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(length = 55, nullable = false)
    private String nombre;
    @Column(nullable = false, columnDefinition = "ENUM('PASIVA', 'AGRESIVA', 'TEMERARIA')")
    @Enumerated(EnumType.STRING)
    private String conduccion;

    
    public Piloto() {
    }


    public Piloto(String nombre, String conduccion) {
        this.nombre = nombre;
        this.conduccion = conduccion;
    }


    public Piloto(Integer id, String nombre, String conduccion) {
        this.id = id;
        this.nombre = nombre;
        this.conduccion = conduccion;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getConduccion() {
        return conduccion;
    }


    public void setConduccion(String conduccion) {
        this.conduccion = conduccion;
    }
    
    










    
}
