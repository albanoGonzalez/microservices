package com.test_java.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CuentaApi {

    private CuentaRepository cuentaRepository;

    @GetMapping("/cuenta")
    public List<Cuenta> obtenerTodosLosUsuarios() {
        return cuentaRepository.findAll();
    }

    @GetMapping("/cuenta/{id}")
    public Cuenta obtenerCuentaPorId(@PathVariable String id) {
        return cuentaRepository.findById(id).orElse(null);
    }
}
