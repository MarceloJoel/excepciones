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
        int valor = Integer.parseInt(numero);
        int resultado = 20 / valor;
        return "Resultado: " + resultado;
    }
}

@RestController
class ObjectoNulo {

    @GetMapping("valornulo")
    public String nulo() {
        String valorNulo = null;
        return "Valor nulo en la variable";
    }
}
