package org.example.servis;

import org.example.entity.Customer;
import org.example.entity.House;

import java.util.List;

public interface CustomerService {
    Customer saveOrUpdate(Customer customer); // Create or update
    Customer findById(Long id); // Read
    List<Customer> findAll(); // Read all
    void deleteById(Long id); // Delete
    Customer update(Long id ,Customer customer); // Update
    Customer findByEmail(String email);
    void getRent_iNFO(String lastname);
}


