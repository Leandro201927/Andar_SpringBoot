package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.CategoriaModel;
import com.example.andar.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public ArrayList<CategoriaModel> findAllCategories(){
        return (ArrayList<CategoriaModel>) categoriaRepository.findAll();
   }

   public CategoriaModel saveCategory(CategoriaModel usuario){
       return categoriaRepository.save(usuario);
   }

   public Optional<CategoriaModel> getCategoryById(Long id) {
       return categoriaRepository.findById(id);
   }

   public boolean deleteCategory(Long id) {
       try {
           categoriaRepository.deleteById(id);
           return true;
       } catch (Exception err) {
           return false;
       }
   }
}
