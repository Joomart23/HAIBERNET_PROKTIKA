package org.example.dao;

import org.example.entity.Customer;
import org.example.entity.House;

import java.util.List;

public interface HouseDao {
    House saveOrUpdate(House house); // Create or update
    List<House> findById(Long id); // Read
    List<House> findAll(); // Read all
    void deleteById(Long id); // Delete
    House update(House house); // Update
    List<House> findByType(String houseType); // Find by specific criteria





}

