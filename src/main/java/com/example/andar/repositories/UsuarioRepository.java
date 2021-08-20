package com.example.andar.repositories;

import com.example.andar.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
     
}
