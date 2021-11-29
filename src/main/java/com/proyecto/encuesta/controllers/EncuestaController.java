package com.proyecto.encuesta.controllers;

import com.proyecto.encuesta.models.Persona;
import com.proyecto.encuesta.repositories.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path="/encuesta")
public class EncuestaController {
    @Autowired
    private PersonaRepo personaRepo;

    @PostMapping(path="/add")
    public @ResponseBody String guardarEncuesta (@RequestBody Persona persona) {
        personaRepo.save(persona);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Persona> obtenerEncuestas() {
        return personaRepo.findAll();
    }
}