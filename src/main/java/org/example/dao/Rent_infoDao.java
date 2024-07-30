package org.example.dao;

import org.example.entity.Rent_info;

import java.util.List;

public interface Rent_infoDao {
    Rent_info saveOrUpdate(Rent_info rentInfo); // Create or update

    List<Rent_info> findById(Long id); // Read

    List<Rent_info> findAll(); // Read all

    void deleteById(Long id); // Delete

    Rent_info update(Rent_info rentInfo); // Update

    List<Rent_info> findByCustomerId(Long customerId);
}// Find by specific criteria