package com.curso.spring.controller;

import com.curso.spring.dto.request.DatosTablasRequest;
import com.curso.spring.service.DatosTablasService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardar-datos-tablas-gradle")
@Tag(name = "Servicio para guardar datos en las 3 tablas")
public class DatosTablasControler {

    @Autowired
    private DatosTablasService datosTablasService;

    @PostMapping("/datos-tablas-guardar")
    @Operation(summary = "Operacion para guardar datos en las tres tablas de la base de datos")
    ResponseEntity<Object> guardatDatosTablas(@RequestBody DatosTablasRequest datosTablasRequest){
        return datosTablasService.guardarDatosTablas(datosTablasRequest);

    }
}
