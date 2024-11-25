package com.motogp.model.service.interfaces;

import org.springframework.stereotype.Service;

import com.motogp.model.entities.Piloto;

@Service
public interface  IPilotoService {
    
    public void guardarPiloto(Piloto pilotoNuevo);

}
