package com.example.demo;


import org.example.calculadora.DatosRequest;
import org.example.calculadora.DatosResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class CalculadoraEndPoint {

    @PayloadRoot(namespace= "http://www.example.org/calculadora", localPart= "DatosRequest")
    
    @ResponsePayload
    public DatosResponse dameDatos(@RequestPayload DatosRequest peticion){
        String resultado = "";
        DatosResponse respuesta =  new DatosResponse();
        if(Integer.parseInt(String.valueOf(peticion.getEdad())) < 76){
            if(Integer.parseInt((peticion.getIngresoMensual())) > 6000){
                if(String.valueOf(peticion.getCancer()).equals("no")){
                    resultado = "Aplica para prestamo";
                } else {
                    resultado = "No aplica para prestamo";
                }
            } else {
                resultado = "No aplica para prestamo";
            }          
        } else {
            resultado = "No aplica para prestamo";
        }
        respuesta.setRespuesta(resultado);
        return respuesta;
    }
}