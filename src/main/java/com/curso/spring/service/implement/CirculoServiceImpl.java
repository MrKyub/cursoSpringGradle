package com.curso.spring.service.implement;

import com.curso.spring.dto.CirculoDto;
import com.curso.spring.service.CirculoService;
import org.springframework.stereotype.Service;

@Service
public class CirculoServiceImpl implements CirculoService {

    @Override
    public double calcularAreaCirculo(CirculoDto request) {

        double area = Math.PI * Math.pow(request.getRadio(), 2);

        return area;
    }

    @Override
    public double calcularPermietroCirculo(CirculoDto request) {

        double perimetro = 2 * Math.PI * request.getRadio();

        return perimetro;
    }
}
