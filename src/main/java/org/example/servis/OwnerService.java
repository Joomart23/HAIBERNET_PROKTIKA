package org.example.servis;

import org.example.entity.Owner;

import java.util.List;

public interface OwnerService {
    Owner saveOrUpdate(Owner owner); // Create or update
    Owner findById(Long id); // Read
    List<Owner> findAll(); // Read all
    void deleteById(Long id); // Delete
    Owner update(Long id,Owner owner); // Update
    Owner findByEmail(String email);
    void ownerAndHouse();
}
