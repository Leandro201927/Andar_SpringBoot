package com.example.andar.repositories;

import com.example.andar.models.SubcategoriaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoriaRepository extends CrudRepository<SubcategoriaModel, Long>{
    
}
