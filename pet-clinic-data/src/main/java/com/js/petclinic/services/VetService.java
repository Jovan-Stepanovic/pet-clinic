package com.js.petclinic.services;

import com.js.petclinic.model.Owner;
import com.js.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Owner vet);

    Set<Vet> findAll();
}
