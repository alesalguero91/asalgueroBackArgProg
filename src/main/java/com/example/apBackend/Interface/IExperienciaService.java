/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Interface;

import com.example.apBackend.Models.Experiencia;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IExperienciaService {
    public List<Experiencia> verExperiencia();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
}
