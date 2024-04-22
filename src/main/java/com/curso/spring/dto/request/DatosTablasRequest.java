package com.curso.spring.dto.request;

import com.curso.spring.model.Direcciones;
import com.curso.spring.model.Empleos;
import com.curso.spring.model.Personas;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DatosTablasRequest {

    private Personas datosPersona;

    private Empleos datosEmpleo;

    private Direcciones datosDireccion;

}
