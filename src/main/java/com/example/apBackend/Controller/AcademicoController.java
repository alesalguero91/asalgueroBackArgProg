/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Controller;

import com.example.apBackend.Interface.IAcademicoService;
import com.example.apBackend.Models.Academico;
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
public class AcademicoController {
    @Autowired IAcademicoService iAcadService;
    
    @GetMapping("/academico/traer")
    @ResponseBody
    public List<Academico>traerAcad(){
       return iAcadService.verAcademico();
    }
    
    
    @PostMapping("/academico/crear")
    public void crearAcad(@RequestBody Academico ac){
        iAcadService.crearAcademico(ac);
    }
    
    @GetMapping("/academico/buscar/{id}")
    @ResponseBody
    public Academico buscarAcademico(@PathVariable Long id){
        return iAcadService.buscarAcademico(id);
    }
    
    
    @DeleteMapping("/academico/borrar/{id}")
    public void eliminarAcad(@PathVariable Long id){
        iAcadService.borrarAcademico(id);
        
    }
    
    
    @PutMapping("/academico/editar/{id}")
    public Academico editarAcademico(@PathVariable Long id, @RequestBody Academico academico){
        Academico ac = iAcadService.buscarAcademico(id);
        
        ac.setTitulo(academico.getTitulo());
        ac.setEstablecimiento(academico.getEstablecimiento());
        ac.setAnioIngAcad(academico.getAnioIngAcad());
        ac.setAnioEgAcad(academico.getAnioEgAcad());
        ac.setPromedio(academico.getPromedio());
        ac.setFinalizado(academico.getFinalizado());
        
        iAcadService.crearAcademico(ac);
        return ac;
        
    }
    
}
