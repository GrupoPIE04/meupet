package com.example.meupetsystem.Repository;

import com.example.meupetsystem.Classes.HistoricoEvolucao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoEvolucaoRepository extends JpaRepository<HistoricoEvolucao, Long> {
}