package com.example.meupetsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.meupetsystem.Classes.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}