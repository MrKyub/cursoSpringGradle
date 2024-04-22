package com.curso.spring.service;

import com.curso.spring.dto.request.PersonaRequest;
import com.curso.spring.dto.response.DatosPersonaResponse;
import com.curso.spring.model.Personas;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonaService {

    List<Personas> findAllPersons();

    ResponseEntity<Personas> guardarPersona(Personas persona);

    ResponseEntity<Personas> guardarPersona2(PersonaRequest persona);

    Personas buscarPersonaId(Long id);

    ResponseEntity<Object> actualizarPersona(PersonaRequest persona);

    void eliminarPersona(Long id);

    List<String> obtenerPersonasPorGenero(String genero);

    ResponseEntity<Object> obtenerDatosPersonaFiltro(Integer id);

    ResponseEntity<?> guardarPersonaFormaNativa(PersonaRequest reuqest);

    ResponseEntity<?> actualizarPersonaFormaNativa(PersonaRequest reuqest);

    boolean eliminarPersonaFormaNativa(int id);
}
