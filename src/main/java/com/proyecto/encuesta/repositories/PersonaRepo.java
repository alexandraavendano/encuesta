package com.proyecto.encuesta.repositories;

import com.proyecto.encuesta.models.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona, Integer> {
}