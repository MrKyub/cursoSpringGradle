package com.curso.spring.controller;

import com.curso.spring.dto.Persona;
import com.curso.spring.service.EjerciciosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso-spring-gradle")
@Slf4j
public class HolaMundoController {

    //injeccion de la dependencia
    @Autowired
    private EjerciciosService ejerciciosService;

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo desde spring con gradle";
    }

    @GetMapping(path = "/hola/{nombre}")
    public String holaMundoCustom(@PathVariable String nombre){
        log.info("El nombre que se envia atraves de la url es : " + nombre);
        return "Hola mundo " + nombre;
    }

    @PostMapping("/persona")
    public Persona datosPersona(@RequestBody Persona persona){
        return persona;
    }

    @GetMapping("/nombres")
    public List<String> getListaNombres(){
        return ejerciciosService.getListaNombres();
    }

}
