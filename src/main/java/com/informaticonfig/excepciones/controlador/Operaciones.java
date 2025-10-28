package com.informaticonfig.excepciones.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/divide")
public class Operaciones {

    @GetMapping
    public String Divide(@RequestParam String numero) {
        try {
            int valor = Integer.parseInt(numero);
            int resultado = 20 / valor;
            return "Resultado: " + resultado;
        } catch (NumberFormatException ERROR) {    //Formato de valor equivocado
            return "Error: el valor ingresado ('" + numero + "') no es un numero";
        } catch (ArithmeticException ERROR) {      //Excepcion aritmetico
            return "Error: no se puede dividir entre 0";
        }

    }

}
