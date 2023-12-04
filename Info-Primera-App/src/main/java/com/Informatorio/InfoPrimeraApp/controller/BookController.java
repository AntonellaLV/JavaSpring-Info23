package com.Informatorio.InfoPrimeraApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotación a nivel de clase
public class BookController {

    /*
    GET --> Obtener
    http://localhost:8080/aplicacion/v1/despedida
    */
    @GetMapping("/aplicacion/v1/despedida") //Anotación a nivel de método
    public String goodByeWorld(){
        return "¡Adiós mundo cruel!";
    }

    //http://localhost:8080/aplicacion/v1/saludo?nombre&=Antonella
    @GetMapping("/aplicacion/v1/saludo")
    public String helloWorld(@RequestParam(required = true,name = "nombre") String nombre){
        //@RequestParam(required = true,name = "nombre") String nombre Anotación a nivel de atributo.
        return "Hello " + nombre;
    }

}
