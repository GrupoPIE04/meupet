package com.example.meupetsystem.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Repository.VacinaRepository;
import java.util.List;
import com.example.meupetsystem.Classes.Vacina;

@Service
public class VacinaService {
    @Autowired
    private VacinaRepository vacinaRepository;
    // CRUD methods
    public void findAllVacinas() {
        vacinaRepository.findAll();
    }
    public List<Vacina> getAllVacinas() {
        return vacinaRepository.findAll();
    }
    public Vacina createVacina(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }
    public Vacina updateVacina(Long id, Vacina vacinaDetails) {
        Vacina vacina = vacinaRepository.findById(id).orElseThrow(() -> new RuntimeException("Vacina not found"));
        vacina.setNome(vacinaDetails.getNome());
        vacina.setData(vacinaDetails.getData());
        return vacinaRepository.save(vacina);
    }
    public void deleteVacina(Long id) {
        Vacina vacina = vacinaRepository.findById(id).orElseThrow(() -> new RuntimeException("Vacina not found"));
        vacinaRepository.delete(vacina);
    }
}
