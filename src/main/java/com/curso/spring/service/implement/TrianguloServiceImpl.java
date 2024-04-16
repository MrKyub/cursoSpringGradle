package com.curso.spring.service.implement;

import com.curso.spring.dto.TrianguloDto;
import com.curso.spring.service.TrianguloService;
import org.springframework.stereotype.Service;

@Service
public class TrianguloServiceImpl implements TrianguloService {

    @Override
    public double calcularAreaTriangulo(TrianguloDto request) {

        double area = (request.getBase() * request.getAltura()) / 2;

        return area;
    }

    @Override
    public double calcularPerimetroTriangulo(TrianguloDto request) {

        double perimetro = 3 * request.getLado();

        return 0;
    }
}
