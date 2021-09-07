package com.example.andar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.CategoriaModel;
import com.example.andar.repositories.CategoriaRepository;
import com.example.andar.services.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired 
    CategoriaService categoriaService;
    CategoriaRepository categoriaRepository;

    @GetMapping()
    public ArrayList<CategoriaModel> findAllCategorias() {
        return categoriaService.findAllCategories();
    }

    @PostMapping()
    public CategoriaModel saveCategoria(@RequestBody CategoriaModel categoria) {
        return this.categoriaService.saveCategory(categoria);
    }
    //GET: categoria/{id}
    @GetMapping(path = "/{id}")
    public Optional<CategoriaModel> getCategoriaById(@PathVariable("id") Long id) {
        return this.categoriaService.getCategoryById(id);
    }

    //DELETE: categoria/{id}
    @DeleteMapping(path = "{id}")
    public String deleteCategoriaById(@PathVariable("id") Long id) {
        boolean ok = this.categoriaService.deleteCategory(id);
        if(ok) {
            return "Se eliminó la categoria con id " + id;        
        } else {
            return "No se puedo eliminar la categoria con id: " + id;
        }
    }
}
