package com.example.meupetsystem.Services;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.meupetsystem.Classes.HistoricoEvolucao;
import com.example.meupetsystem.Repository.HistoricoEvolucaoRepository;

@Service
public class HistoricoEvolucaoService {
    @Autowired
    private HistoricoEvolucaoRepository historicoEvolucaoRepository;
    // CRUD methods

    public List<HistoricoEvolucao> findAll() {

    return historicoEvolucaoRepository.findAll();

}

}