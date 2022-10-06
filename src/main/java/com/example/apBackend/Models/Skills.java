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
@Getter  @Setter
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String herramienta;
    private int nivel;
    
    public Skills(){
        
    }

    public Skills(Long id, String herramienta, int nivel) {
        this.id = id;
        this.herramienta = herramienta;
        this.nivel = nivel;
    }
    
    
}
