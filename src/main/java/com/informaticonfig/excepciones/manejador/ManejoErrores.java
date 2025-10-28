package com.informaticonfig.excepciones.manejador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException ERROR) {
        return new ResponseEntity<>("Error: division entre cero no permitida", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handlerNullPointerException(NullPointerException ERROR) {
        return new ResponseEntity<>("Error: valor de la variable no debe ser nulo", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handlerNumberFormatException(NumberFormatException ERROR) {
        return new ResponseEntity<>("Error: formato de valor ingresado es incorrecro", HttpStatus.BAD_REQUEST);
    }

}
