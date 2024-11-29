package com.example.meupetsystem.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Repository.ProprietarioRepository;
import com.example.meupetsystem.Classes.Proprietario;
import java.util.List;

@Service
public class ProprietarioService {
    @Autowired
    private ProprietarioRepository proprietarioRepository;
    // CRUD methods
    public List<Proprietario> findAll() {
        return proprietarioRepository.findAll();
    }
    public List<Proprietario> getAllProprietarios() {
        return proprietarioRepository.findAll();
    }
}