/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Interface;

import com.example.apBackend.Models.Persona;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IPersonaService {
    
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
