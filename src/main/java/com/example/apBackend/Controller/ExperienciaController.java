/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Controller;

import com.example.apBackend.Interface.IExperienciaService;
import com.example.apBackend.Models.Experiencia;
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
//@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired IExperienciaService iExperienciaService;
     
    @GetMapping("/experiencia/traer")
    @ResponseBody
    public List<Experiencia>verExp(){
        return iExperienciaService.verExperiencia();
    }
    
   
    @PostMapping("/experiencia/crear")
    public void crearExperiencia(@RequestBody Experiencia exp){
        iExperienciaService.crearExperiencia(exp);
    }
    
    @GetMapping("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return iExperienciaService.buscarExperiencia(id);
    }
     
   
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExp(@PathVariable Long id){
        iExperienciaService.borrarExperiencia(id);
    }
    
  
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editarExp(@PathVariable Long id, @RequestBody Experiencia experiencia){
        Experiencia exp = iExperienciaService.buscarExperiencia(id);
        
        exp.setEmpresa(experiencia.getEmpresa());
        exp.setPuesto(experiencia.getPuesto());
        exp.setAnioIngExp(experiencia.getAnioIngExp());
        exp.setAnioEgExp(experiencia.getAnioEgExp());
        exp.setDescripcion(experiencia.getDescripcion());
        
        iExperienciaService.crearExperiencia(exp);
        return exp;
    }
    
}
