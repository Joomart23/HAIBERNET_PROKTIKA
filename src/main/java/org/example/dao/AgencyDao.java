package org.example.dao;

import org.example.entity.Address;
import org.example.entity.Agency;

import java.util.List;
import java.util.Optional;

public interface AgencyDao {
    Agency saveOrUpdate(Agency agency); // Create or update
    Agency findById(Long id); // Read
    List<Agency> findAll(); // Read all
    void deleteById(Long id); // Delete
    Agency update( Long id,Agency agency); // Update
    Agency findByName(String name); // Find by specific criteria
}


