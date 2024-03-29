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
@Entity
@Getter @Setter
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String puesto;
    private String anioIngExp;
    private String anioEgExp;
    private String descripcion;
    
    public Experiencia(){
        
    }

    public Experiencia(Long id, String empresa, String puesto, String anioIngExp, String anioEgExp, String descripcion) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.anioIngExp = anioIngExp;
        this.anioEgExp = anioEgExp;
        this.descripcion = descripcion;
    }
    
    
}
