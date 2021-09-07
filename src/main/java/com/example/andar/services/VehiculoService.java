package com.example.andar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.andar.models.VehiculoModel;
import com.example.andar.repositories.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {
    @Autowired
    VehiculoRepository vehiculoRepository;

    public ArrayList<VehiculoModel> findAllVehiculos(){
         return (ArrayList<VehiculoModel>) vehiculoRepository.findAll();
    }

    public VehiculoModel saveVehiculo(VehiculoModel vehiculo){
        return vehiculoRepository.save(vehiculo);
    }

    public Optional<VehiculoModel> getVehiculoById(Long id) {
        return vehiculoRepository.findById(id);
    }
    
    public boolean eliminarVehiculo(Long id) {
        try {
            vehiculoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
