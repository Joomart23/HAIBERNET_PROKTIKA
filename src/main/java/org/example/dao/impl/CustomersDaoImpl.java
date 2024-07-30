package org.example.dao.impl;

import org.example.dao.CustomerDao;
import org.example.dao.HouseDao;
import org.example.entity.Customer;
import org.example.entity.House;
import org.example.servis.impl.CustomerServiceImpl;

import java.util.List;

public class CustomersDaoImpl implements CustomerDao {
    private final CustomerServiceImpl customerService = new CustomerServiceImpl();

    @Override
    public Customer saveOrUpdate(Customer customer) {
        return customerService.saveOrUpdate(customer);
    }

    @Override
    public Customer findById(Long id) {
        return customerService.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @Override
    public void deleteById(Long id) {
       customerService.deleteById(id);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        return customerService.update(id, customer);
    }

    @Override
    public Customer findByEmail(String email) {
        return customerService.findByEmail(email);
    }

    @Override
    public void getRent_iNFO(String lastname) {
      customerService.getRent_iNFO(lastname);
    }
}