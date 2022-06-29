package com.examen.controller;

import com.examen.entity.Concierto;
import com.examen.service.ConciertoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Dennis Serrano Barquero
 */

@Controller
@Slf4j
public class indexController {
    @Autowired
    private ConciertoService conciertoservice;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Se está usando una arquitectura mvc");
        var conciertos = conciertoservice.getConciertos();
        model.addAttribute("conciertos",conciertos);
        return "index";
    }
    
    @GetMapping("/nuevoConcierto")
    public String nuevoConcierto(Concierto concierto) {
        return "conciertos";
    }
    
    @PostMapping("/guardarConcierto")
    public String guardarConcierto(Concierto concierto) {
        conciertoservice.save(concierto);
        return "redirect:/";
    }
    
    @GetMapping("/modificarConcierto/{idConcierto}")
    public String modificarConcierto(Concierto concierto, Model model) {
        concierto = conciertoservice.getConcierto(concierto);
        model.addAttribute("concierto", concierto);
        return "conciertos";
    }
    
    @GetMapping("/eliminarConcierto/{idConcierto}")
    public String eliminarConcierto(Concierto concierto, Model model) {
        conciertoservice.delete(concierto);
        return "redirect:/";
    }
}