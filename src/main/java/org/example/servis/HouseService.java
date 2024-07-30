package org.example.servis;

import org.example.entity.Customer;
import org.example.entity.House;

import java.util.List;

public interface HouseService {
    House saveOrUpdate(House house); // Create or update
    House findById(Long id); // Read
    List<House> findAll(); // Read all
    void deleteById(Long id); // Delete
    House update( Long id,House house); // Update
}


