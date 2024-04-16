package com.curso.spring.service.implement;

import com.curso.spring.service.EjerciciosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class EjerciciosServiceImpl implements EjerciciosService {

    @Override
    public List<String> getListaNombres() {
        log.info("Entro al metodo getListaNombres");

        List<String> response = new ArrayList<>();
        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Alexis");
        listaNombres.add("Johan");
        listaNombres.add("Cecilia");
        listaNombres.add("Isaac");

        /*for (String nombre : listaNombres){
            if(nombre.contains("o") || nombre.contains("O")){
                log.info("Entro al if de lista nombres");
                response.add(nombre);
            }
        }*/

        /*int index = 0;
        while(index < listaNombres.size()){
            String nombre = listaNombres.get(index);
            if(nombre.toLowerCase().contains("o")){
                response.add(nombre);
            }
            index++;
        }*/

        int index = 0;
        do{
           String nombre = listaNombres.get(index);
            if(nombre.toLowerCase().contains("o")){
                response.add(nombre);
            }
            index++;
        } while(index < listaNombres.size());

        /*response = listaNombres.stream()
                .filter(nombre -> nombre.toLowerCase().contains("0"))
                .*/


        return response;
    }
}
