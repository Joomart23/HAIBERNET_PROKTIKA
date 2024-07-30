package org.example.dao;

import org.example.entity.Address;
import org.example.entity.Agency;

import java.util.List;

public interface AddressDao {
    Address saveOrUpdate(Address address); // Create or update
    Address findById(Long id); // Read
    List<Address> findAll(); // Read all
    void deleteById(Long id); // Delete
    Address update( Long id ,Address Newaddress); // Update
    Address findByCity(String city);
    void getAgencyByAdress();
    void  getAgencyByCity(String city);// Find by specific criteria
}

