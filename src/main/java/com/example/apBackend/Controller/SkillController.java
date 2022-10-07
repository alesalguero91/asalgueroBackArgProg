/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Controller;

import com.example.apBackend.Interface.ISkillService;
import com.example.apBackend.Models.Skills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SkillController {
    @Autowired ISkillService iSkillServ;
    
    @GetMapping("/skill/traer")
    @ResponseBody
    public List<Skills>verSkills(){
        return iSkillServ.verSkills();
    }
    
    @PostMapping("/skill/crear")
    public void crearSkill(@RequestBody Skills sk){
        iSkillServ.crearSkill(sk);
    }
    
    @GetMapping("/skill/buscar/{id}")
    @ResponseBody
    public Skills buscarSkill(@PathVariable Long id){
        return iSkillServ.buscarSkill(id);
    }
    
    @DeleteMapping("/skill/borrar/{id}")
    public void borrarSkill(@PathVariable Long id){
        iSkillServ.borrarSkills(id);
    }
    
    @PutMapping("/skill/editar/{id}")
    public Skills editarSkill(@PathVariable Long id, @RequestBody Skills skill){
        Skills sk = iSkillServ.buscarSkill(id);
        
        sk.setHerramienta(skill.getHerramienta());
        sk.setNivel(skill.getNivel());
        
        iSkillServ.crearSkill(sk);
        return sk;
    }
    
}
