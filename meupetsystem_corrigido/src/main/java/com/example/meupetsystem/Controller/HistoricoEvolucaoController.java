package com.example.meupetsystem.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Services.HistoricoEvolucaoService;
import java.util.List;
import com.example.meupetsystem.Classes.HistoricoEvolucao;

@RestController
@RequestMapping("/historicos")
public class HistoricoEvolucaoController {
    @Autowired
    private HistoricoEvolucaoService historicoEvolucaoService;
    // Endpoints for CRUD operations

    // Example endpoint to use historicoEvolucaoService
    @GetMapping("/all")
    public List<HistoricoEvolucao> getAllHistoricos() {
        return historicoEvolucaoService.findAll();
    }
}