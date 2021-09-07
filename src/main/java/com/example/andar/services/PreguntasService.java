package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.PreguntasModel;
import com.example.andar.repositories.PreguntasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntasService {
    @Autowired
    PreguntasRepository preguntasRepository;

    public ArrayList<PreguntasModel> findAllPreguntas(){
         return (ArrayList<PreguntasModel>) preguntasRepository.findAll();
    }

    public PreguntasModel savePregunta(PreguntasModel pregunta){
        return preguntasRepository.save(pregunta);
    }

    public Optional<PreguntasModel> getPreguntaById(Long id) {
        return preguntasRepository.findById(id);
    }
    
    public boolean eliminarPregunta(Long id) {
        try {
            preguntasRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}