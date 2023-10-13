/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Controller;

import com.example.apBackend.Interface.IProyectoService;
import com.example.apBackend.Models.Proyectos;
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
public class ProyectoController {
    @Autowired IProyectoService iproyService;
    
    @GetMapping("/proyecto/traer")
    @ResponseBody
    public List<Proyectos>proy(){
        return iproyService.verProyectos();
    }
  
    
    @PostMapping("/proyecto/crear")
    public void crearProy(@RequestBody Proyectos proy){
       iproyService.crearProyectos(proy);
    }
    
    @GetMapping("/proyecto/buscar/{id}")
    @ResponseBody
    public Proyectos buscarProy(@PathVariable Long id){
        return iproyService.buscarProyectos(id);
    }
    
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public void borrarProy(@PathVariable Long id){
        iproyService.borrarProyectos(id);
    }
    
    
    @PutMapping("/proyecto/editar/{id}")
    public Proyectos editarProy(@PathVariable Long id, @RequestBody Proyectos proyecto){
        Proyectos proy = iproyService.buscarProyectos(id);
        
        proy.setNombreProy(proyecto.getNombreProy());
        proy.setDetalleProy(proyecto.getDetalleProy());
        proy.setImgProy(proyecto.getImgProy());
        proy.setUrlProy(proyecto.getUrlProy());
        
        iproyService.crearProyectos(proy);
        return proy;
    }

}
