/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.apBackend.Interface;

import com.example.apBackend.Models.Skills;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface ISkillService {
   public List<Skills> verSkills();
    public void crearSkill(Skills sk);
    public void borrarSkills(Long id);
    public Skills buscarSkill(Long id); 
}
