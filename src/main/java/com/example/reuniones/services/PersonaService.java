package com.example.reuniones.services;

import com.example.reuniones.data.PersonaRepository;
import com.example.reuniones.models.Persona;
import com.example.reuniones.models.Reunion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    /*private static final List<Persona> personas = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++) {
            Persona persona = new Persona(i, "Nombre " + i, "Apellido " + i);
            personas.add(persona);
        }
    }*/

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }
}
