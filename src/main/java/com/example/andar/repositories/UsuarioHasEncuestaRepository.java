package com.example.andar.repositories;

import com.example.andar.models.UsuarioHasEncuestaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioHasEncuestaRepository extends CrudRepository<UsuarioHasEncuestaModel, Long>{
    
}
