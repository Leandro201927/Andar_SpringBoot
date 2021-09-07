package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.EncuestaModel;
import com.example.andar.repositories.EncuestaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService {
    @Autowired
    EncuestaRepository encuestaRepository;

    public ArrayList<EncuestaModel> findAllEncuestas(){
         return (ArrayList<EncuestaModel>) encuestaRepository.findAll();
    }

    public EncuestaModel saveEncuesta(EncuestaModel usuario){
        return encuestaRepository.save(usuario);
    }

    public Optional<EncuestaModel> getEncuestaById(Long id) {
        return encuestaRepository.findById(id);
    }
    
    public boolean eliminarEncuesta(Long id) {
        try {
            encuestaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

