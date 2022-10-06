/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Interface;

import com.example.apBackend.Models.Academico;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IAcademicoService {
    
    public List<Academico> verAcademico();
    public void crearAcademico(Academico ac);
    public void borrarAcademico(Long id);
    public Academico buscarAcademico(Long id);
}
