/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Service;

import com.example.apBackend.Interface.IProyectoService;
import com.example.apBackend.Models.Proyectos;
import com.example.apBackend.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class ProyectoService implements IProyectoService{
    @Autowired ProyectoRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        List<Proyectos>proy = proyRepo.findAll();
        return proy;
    }

    @Override
    public void crearProyectos(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyectos(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        Proyectos proy = proyRepo.findById(id).orElse(null);
        return proy;
    }
    
    
}
