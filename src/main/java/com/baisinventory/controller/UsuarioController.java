package com.baisinventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/api/usuarios")
    public String listarUsuarios() {
        return "Lista de usuarios de ejemplo";
    }
}