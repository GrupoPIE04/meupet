package com.example.meupetsystem.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.meupetsystem.Services.PetService;
import java.util.List;
import com.example.meupetsystem.Classes.Pet;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetService petService;
    // Endpoints for CRUD operations

    // Example endpoint to get all pets
    @GetMapping
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }
}