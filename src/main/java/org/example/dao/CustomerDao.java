package org.example.dao;

import org.example.entity.Customer;

import java.util.List;

public interface CustomerDao {
    Customer saveOrUpdate(Customer customer); // Create or update
    Customer findById(Long id); // Read
    List<Customer> findAll(); // Read all
    void deleteById(Long id); // Delete
    Customer update(Long id ,Customer customer); // Update
    Customer findByEmail(String email);
    void getRent_iNFO(String lastname);
}
