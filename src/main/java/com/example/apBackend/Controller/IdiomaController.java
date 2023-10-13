/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Controller;

import com.example.apBackend.Interface.IIdiomaService;
import com.example.apBackend.Models.Idiomas;
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
//@CrossOrigin(origins = "https://alesalgueroprotafolioap.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class IdiomaController {
    @Autowired IIdiomaService iIdiomaServ;
    
    @GetMapping("/idioma/traer")
    @ResponseBody
    public List<Idiomas>lang(){
        return iIdiomaServ.verIdiomas();
    }
    
    
    @PostMapping("/idioma/crear")
    public void crearIdioma(@RequestBody Idiomas lang){
        iIdiomaServ.crearIdiomas(lang);
    }
    
    @GetMapping("/idioma/buscar/{id}")
    @ResponseBody
    public Idiomas buscarIdioma(@PathVariable Long id){
        return iIdiomaServ.buscarIdiomas(id);
    }
    
    
   
    @DeleteMapping("/idioma/borrar/{id}")
    public void BorrarIdioma(@PathVariable Long id){
        iIdiomaServ.borrarIdiomas(id);
    }
    
   
    @PutMapping("/idioma/editar/{id}")
    public Idiomas editarIdioma(@PathVariable Long id, @RequestBody Idiomas idioma){
        Idiomas lang = iIdiomaServ.buscarIdiomas(id);
        
        lang.setIdiom(idioma.getIdiom());
        lang.setOral(idioma.getOral());
        lang.setEscrito(idioma.getEscrito());
        
        iIdiomaServ.crearIdiomas(lang);
        return lang;
    }
    
}
