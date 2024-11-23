package com.motogp.model.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;

import com.motogp.model.entities.Piloto;
import com.motogp.model.repositories.IPiloto;
import com.motogp.model.service.interfaces.IPilotoService;

public class PilotoService implements IPilotoService {

    @Autowired
    IPiloto pilotoRepo;
    @Override
    public void guardarPiloto(Piloto pilotoNuevo) {
       pilotoRepo.save(pilotoNuevo);
    }
    
    
}
