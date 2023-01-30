package com.example.proyecto3.controllers;


import com.example.proyecto3.models.Cliente;
import com.example.proyecto3.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listaClientes() {
        return clienteRepository.findAll();
    }
}
