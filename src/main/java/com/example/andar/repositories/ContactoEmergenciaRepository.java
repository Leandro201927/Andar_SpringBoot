package com.example.andar.repositories;

import com.example.andar.models.ContactoEmergenciaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoEmergenciaRepository extends CrudRepository<ContactoEmergenciaModel, Long> {
    
}
