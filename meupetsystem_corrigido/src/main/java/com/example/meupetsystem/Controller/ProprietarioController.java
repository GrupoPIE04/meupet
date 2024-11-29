package com.example.meupetsystem.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Services.ProprietarioService;
import java.util.List;
import com.example.meupetsystem.Classes.Proprietario;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {
    @Autowired
    private ProprietarioService proprietarioService;
    // Endpoints for CRUD operations

    // Example endpoint to get all proprietarios
    @GetMapping
    public List<Proprietario> getAllProprietarios() {
        return proprietarioService.getAllProprietarios();
    }
}