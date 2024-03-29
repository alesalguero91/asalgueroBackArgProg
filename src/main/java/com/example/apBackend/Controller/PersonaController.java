/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Controller;

import com.example.apBackend.Interface.IPersonaService;
import com.example.apBackend.Models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salguero
 */
@RestController
@CrossOrigin(origins = "https://alesalgueroprotafolioap.web.app")

public class PersonaController {
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping("/persona/traer")
    @ResponseBody
    public List<Persona>verPersona(){
        return iPersonaService.verPersonas();
    }
    
    
    @PostMapping("/persona/crear")
    public void crearPersona(@RequestBody Persona per){
        iPersonaService.crearPersona(per);
    }
    
    @GetMapping("/persona/perfil")
    public Persona traerPerfil(){
     return iPersonaService.buscarPersona((long)1);
    }
    
    @GetMapping("/persona/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
        return iPersonaService.buscarPersona(id);
    }
    
    
   
    @DeleteMapping("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        iPersonaService.borrarPersona(id);
    }
    
   
    @PutMapping("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, @RequestBody Persona persona){
        Persona per = iPersonaService.buscarPersona(id);
        
        per.setNombre(persona.getNombre());
        per.setApellido(persona.getApellido());
        per.setProfesion(persona.getProfesion());
        per.setNivel(persona.getNivel());
        per.setAcercaDeMi(persona.getAcercaDeMi());
        
        iPersonaService.crearPersona(per);
        return per;
        
    }
    
    
}
