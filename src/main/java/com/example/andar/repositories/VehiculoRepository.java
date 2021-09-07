package com.example.andar.repositories;

import com.example.andar.models.VehiculoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends CrudRepository<VehiculoModel, Long> {
    
}
