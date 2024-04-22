package com.curso.spring.service;

import com.curso.spring.dto.request.DatosTablasRequest;
import com.curso.spring.dto.request.DireccionRequest;
import com.curso.spring.dto.request.EmpleoRequest;
import com.curso.spring.dto.request.PersonaRequest;
import org.springframework.http.ResponseEntity;

public interface DatosTablasService {

    ResponseEntity<Object> guardarDatosTablas(DatosTablasRequest datosTablasRequest);

}
