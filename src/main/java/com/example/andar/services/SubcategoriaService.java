package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.SubcategoriaModel;
import com.example.andar.repositories.SubcategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubcategoriaService {
    @Autowired
    SubcategoriaRepository subcategoriaRepository;

    public ArrayList<SubcategoriaModel> findAllSubcategorias(){
         return (ArrayList<SubcategoriaModel>) subcategoriaRepository.findAll();
    }

    public SubcategoriaModel saveSubcategoria(SubcategoriaModel categoria){
        return subcategoriaRepository.save(categoria);
    }

    public Optional<SubcategoriaModel> getSubcategoriaById(Long id) {
        return subcategoriaRepository.findById(id);
    }
    
    public boolean eliminarSubcategoria(Long id) {
        try {
            subcategoriaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
