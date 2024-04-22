package com.curso.spring.service;

import com.curso.spring.dto.request.EmpleoRequest;
import com.curso.spring.model.Empleos;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmpleoService {

    List<Empleos> listaEmpleos();

    ResponseEntity<Empleos> guardarEmpleo(Empleos empleo);

    ResponseEntity<Object> actualizarEmpleo(Empleos empleo);

    ResponseEntity<Object> eliminarEmpleo(Long id);

    ResponseEntity<Object> buscarEmpleoId(Long id);

}
