package com.example.meupetsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.meupetsystem.Services.VacinaService;
import com.example.meupetsystem.Classes.Vacina;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {
    @Autowired
    private VacinaService vacinaService;

    // Endpoints for CRUD operations

    @GetMapping
    public List<Vacina> getAllVacinas() {
        return vacinaService.getAllVacinas();
    }

    @PostMapping
    public Vacina createVacina(@RequestBody Vacina vacina) {
        return vacinaService.createVacina(vacina);
    }

    @PutMapping("/{id}")
    public Vacina updateVacina(@PathVariable Long id, @RequestBody Vacina vacina) {
        return vacinaService.updateVacina(id, vacina);
    }

    @DeleteMapping("/{id}")
    public void deleteVacina(@PathVariable Long id) {
        vacinaService.deleteVacina(id);
    }
}