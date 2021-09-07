package com.example.andar.repositories;

import com.example.andar.models.EncuestaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends CrudRepository<EncuestaModel, Long>{
    
}
