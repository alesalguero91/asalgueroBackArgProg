/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Service;

import com.example.apBackend.Interface.IExperienciaService;
import com.example.apBackend.Models.Experiencia;
import com.example.apBackend.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired ExperienciaRepository iExperienciaRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        List<Experiencia>exp = iExperienciaRepo.findAll();
        return exp;
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        iExperienciaRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        iExperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
       Experiencia exp = iExperienciaRepo.findById(id).orElse(null);
       return exp;
    }
    
}
