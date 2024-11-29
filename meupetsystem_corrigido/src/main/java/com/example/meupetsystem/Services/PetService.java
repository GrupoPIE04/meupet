package com.example.meupetsystem.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.meupetsystem.Repository.PetRepository;
import com.example.meupetsystem.Classes.Pet;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;
    // CRUD methods
    public void findAllPets() {
        petRepository.findAll();
    }
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
}