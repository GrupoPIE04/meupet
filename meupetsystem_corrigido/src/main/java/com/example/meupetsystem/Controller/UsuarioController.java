package com.example.meupetsystem.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Services.UsuarioService;
import java.util.List;
import com.example.meupetsystem.Classes.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    // Endpoints for CRUD operations

    // Example endpoint to use usuarioService
    @GetMapping("/all")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.findAllUsuarios();
    }
}