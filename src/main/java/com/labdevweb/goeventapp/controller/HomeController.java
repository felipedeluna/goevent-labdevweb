package com.labdevweb.goeventapp.controller;

import com.labdevweb.goeventapp.domain.Evento;
import com.labdevweb.goeventapp.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value={"/", "/home"})
public class HomeController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home");
        List<Evento> eventos = eventoService.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }

    @GetMapping(value = "/home/autenticado")
    public ModelAndView home2(){
        ModelAndView mv = new ModelAndView("error");
        List<Evento> eventos = eventoService.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }

    @GetMapping(value = "/politicaTermos")
    public String politicatermos(){
        return "politicaTermos";
    }

    @GetMapping(value = "/perguntasFrequentes")
    public String perguntasfrequentes(){
        return "perguntasFrequentes";
    }
}

