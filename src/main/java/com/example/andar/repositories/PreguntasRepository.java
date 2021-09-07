package com.example.andar.repositories;

import com.example.andar.models.PreguntasModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntasRepository extends CrudRepository<PreguntasModel, Long>{
    
}
