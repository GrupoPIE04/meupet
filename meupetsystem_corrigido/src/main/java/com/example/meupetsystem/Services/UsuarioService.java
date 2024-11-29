package com.example.meupetsystem.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Repository.UsuarioRepository;
import java.util.List;
import com.example.meupetsystem.Classes.Usuario;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    // CRUD methods
    public List<Usuario> findAllUsuarios() {
    return usuarioRepository.findAll();
    }
    
}