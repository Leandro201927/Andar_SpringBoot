package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.UsuarioHasEncuestaModel;
import com.example.andar.repositories.UsuarioHasEncuestaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioHasEncuestaService {
    @Autowired
    UsuarioHasEncuestaRepository usuarioHasEncuestaRepository;

    public ArrayList<UsuarioHasEncuestaModel> findAllUsuarioHasEncuestas(){
         return (ArrayList<UsuarioHasEncuestaModel>) usuarioHasEncuestaRepository.findAll();
    }

    public UsuarioHasEncuestaModel saveUsuarioHasEncuesta(UsuarioHasEncuestaModel usuario_has_encuesta){
        return usuarioHasEncuestaRepository.save(usuario_has_encuesta);
    }

    public Optional<UsuarioHasEncuestaModel> getUsuarioHasEncuestaById(Long id) {
        return usuarioHasEncuestaRepository.findById(id);
    }
    
    public boolean eliminarUsuarioHasEncuesta(Long id) {
        try {
            usuarioHasEncuestaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
