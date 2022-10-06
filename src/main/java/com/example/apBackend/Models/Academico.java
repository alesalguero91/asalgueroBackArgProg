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
public class Academico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String establecimiento;
    private String anioIngAcad;
    private String anioEgAcad;
    private String promedio;
    private String finalizado;
    
    public Academico(){
        
    }

    public Academico(Long id, String titulo, String establecimiento, String anioIngAcad, String anioEgAcad, String promedio, String finalizado) {
        this.id = id;
        this.titulo = titulo;
        this.establecimiento = establecimiento;
        this.anioIngAcad = anioIngAcad;
        this.anioEgAcad = anioEgAcad;
        this.promedio = promedio;
        this.finalizado = finalizado;
    }
    
}
