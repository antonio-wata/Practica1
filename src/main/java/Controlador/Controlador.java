/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Profesor;
import Modelo.ProfesorDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller 
public class Controlador {
    
    @Autowired
    ProfesorDAO profesor_db;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    @RequestMapping(value="/profesor", method = RequestMethod.GET)
    public ModelAndView profesor(ModelMap model,HttpServletRequest request){
        String p = request.getParameter("nombre1");
        Profesor prof = profesor_db.getPersona(p);
        
        String info = "";
        if (prof == null){
            model.addAttribute("info", info+"No se encontro nungun profesor con ese nombre");
        }else{
            model.addAttribute("info", info+"El profesor es");
            model.addAttribute("profesor", prof);
        }
        return new ModelAndView("profesor",model);
    
    }
    
}
