package com.example.reuniones.controller;

import com.example.reuniones.models.Persona;
import com.example.reuniones.models.Reunion;
import com.example.reuniones.services.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/reuniones")
public class ReunionController {

    @Autowired
    private ReunionService reunionService;

    @GetMapping
    public String getAllReuniones(Model model) {
        model.addAttribute("reuniones", reunionService.getAllReuniones());
        return "reuniones";
    }

}
