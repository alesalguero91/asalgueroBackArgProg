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
public class Idiomas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String idiom;
    private int oral;
    private int escrito;
    
    public Idiomas(){
        
    }

    public Idiomas(Long id, String idiom, int oral, int escrito) {
        this.id = id;
        this.idiom = idiom;
        this.oral= oral;
        this.escrito= escrito;
    }
    
    
}
