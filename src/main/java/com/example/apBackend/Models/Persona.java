/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author salguero
 */
@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String profesion;
    private String nivel;
    private String acercaDeMi;
    
    public Persona(){
        
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String nivel, String acercaDeMi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.nivel = nivel;
        this.acercaDeMi = acercaDeMi;
    }
    
    
    
}
