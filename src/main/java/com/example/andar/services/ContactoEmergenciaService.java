package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.ContactoEmergenciaModel;
import com.example.andar.repositories.ContactoEmergenciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoEmergenciaService {
    @Autowired
    ContactoEmergenciaRepository contactoEmergenciaRepository;
 
    public ArrayList<ContactoEmergenciaModel> findAllContactoEmergencia(){
        return (ArrayList<ContactoEmergenciaModel>) contactoEmergenciaRepository.findAll();
   }

   public ContactoEmergenciaModel saveContactoEmergencia(ContactoEmergenciaModel contacto_emergencia){
       return contactoEmergenciaRepository.save(contacto_emergencia);
   }

   public Optional<ContactoEmergenciaModel> getContactoEmergenciaById(Long id) {
       return contactoEmergenciaRepository.findById(id);
   }

   public boolean deleteContactoEmergencia(Long id) {
       try {
           contactoEmergenciaRepository.deleteById(id);
           return true;
       } catch (Exception err) {
           return false;
       }
   }
}
