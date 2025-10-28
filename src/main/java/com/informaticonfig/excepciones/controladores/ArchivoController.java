package com.informaticonfig.excepciones.controladores;

import com.informaticonfig.excepciones.servicio.FileContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/archivo")
public class ArchivoController {

    private final FileContent v_contenido;

    public ArchivoController(FileContent contenido) {
        this.v_contenido = contenido;
    }

    @GetMapping("/lectura")
    public ResponseEntity<String> lectura(@RequestParam String ruta) {
        try {
            String elArchivo = v_contenido.Lecturaarchivo(ruta);
            return ResponseEntity.ok(elArchivo);
        } catch (RuntimeException ERROR) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en la lectura de archivo" + ERROR);
        }
    }
}
