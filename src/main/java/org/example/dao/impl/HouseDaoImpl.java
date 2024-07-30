package org.example.dao.impl;

import org.example.dao.OwnerDao;
import org.example.entity.Customer;
import org.example.entity.Owner;

import java.util.List;

public class HouseDaoImpl implements OwnerDao {

    @Override
    public Owner saveOrUpdate(Owner owner) {
        return null;
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public List<Owner> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Owner update(Long id, Owner owner) {
        return null;
    }

    @Override
    public Owner findByEmail(String email) {
        return null;
    }

    @Override
    public void ownerAndHouse() {

    }
}