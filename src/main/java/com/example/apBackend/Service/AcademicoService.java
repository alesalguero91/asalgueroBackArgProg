/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Service;

import com.example.apBackend.Interface.IAcademicoService;
import com.example.apBackend.Models.Academico;
import com.example.apBackend.Repository.AcademicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class AcademicoService implements IAcademicoService{
    @Autowired AcademicoRepository acadRepo;

    @Override
    public List<Academico> verAcademico() {
        List<Academico>ac = acadRepo.findAll();
        return ac;
    }

    @Override
    public void crearAcademico(Academico ac) {
        acadRepo.save(ac);
    }

    @Override
    public void borrarAcademico(Long id) {
        acadRepo.deleteById(id);
    }

    @Override
    public Academico buscarAcademico(Long id) {
        Academico ac = acadRepo.findById(id).orElse(null);
        return ac;
    }
    
}
