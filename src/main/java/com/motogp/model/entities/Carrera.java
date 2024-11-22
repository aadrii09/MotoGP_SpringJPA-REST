package com.motogp.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.motogp.model.entities.ENUMS.Posicion;

@Entity
@Table(name = "carreras")
public class Carrera {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Integer id ;
    @Column(length = 55, nullable = false)
    @ManyToOne
    @JoinColumn(name = "piloto_id")
    private Piloto piloto;
    private String temporada;
    @Column(nullable = false, columnDefinition = "ENUM('ZERO', 'PRIMERO', 'SEGUNDO', 'TERCERO', 'CUARTO', 'QUINTO', 'SEXTO', 'SÉPTIMO', 'OCTAVO', 'NOVENO', 'DÉCIMO', 'UNDÉCIMO', 'DUODÉCIMO', 'DECIMOTERCERO', 'DECIMOCUARTO', 'DECIMOQUINTO', 'DECIMOSEXTO', 'DECIMOSÉPTIMO', 'DECIMOCTAVO', 'DECIMONOVENO', 'VIGÉSIMO', 'VIGÉSIMO_PRIMERO', 'VIGÉSIMO_SEGUNDO', 'VIGÉSIMO_TERCERO')")
    @Enumerated(EnumType.ORDINAL)
    private Posicion posicion;
    @ManyToOne
    @JoinColumn(name = "circuito_id")
    private Circuito circuito;
    


    public Carrera(String temporada, Posicion posicion) {
        this.temporada = temporada;
        this.posicion = posicion;
    }


    public Carrera(Integer id, String temporada, Posicion posicion) {
        this.id = id;
        this.temporada = temporada;
        this.posicion = posicion;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTemporada() {
        return temporada;
    }


    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }


    public Posicion getPosicion() {
        return posicion;
    }


    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    






    
}
