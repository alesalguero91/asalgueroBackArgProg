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
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreProy;
    private String detalleProy;
    private String imgProy;
    private String urlProy;
    
    public Proyectos(){
        
    }

    public Proyectos(Long id, String nombreProy, String detalleProy, String imgProy, String urlProy) {
        this.id = id;
        this.nombreProy = nombreProy;
        this.detalleProy = detalleProy;
        this.imgProy = imgProy;
        this.urlProy = urlProy;
    }
    
    
    
}
