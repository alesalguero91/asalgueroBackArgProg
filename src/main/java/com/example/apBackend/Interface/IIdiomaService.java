/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Interface;

import com.example.apBackend.Models.Idiomas;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IIdiomaService {
    
    public List<Idiomas> verIdiomas();
    public void crearIdiomas(Idiomas lang);
    public void borrarIdiomas(Long id);
    public Idiomas buscarIdiomas(Long id);
    
}
