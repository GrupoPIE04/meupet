package com.example.meupetsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.meupetsystem.Classes.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}