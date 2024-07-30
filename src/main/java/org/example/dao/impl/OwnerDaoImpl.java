package org.example.dao.impl;

import org.example.dao.OwnerDao;
import org.example.dao.TaskDao;
import org.example.entity.Owner;
import org.example.servis.impl.OwnerServiceImpl;

import java.util.List;

public class OwnerDaoImpl implements OwnerDao {
    private final OwnerServiceImpl ownerService = new OwnerServiceImpl();

    @Override
    public Owner saveOrUpdate(Owner owner) {
        return ownerService.saveOrUpdate(owner);
    }

    @Override
    public Owner findById(Long id) {
        return ownerService.findById(id);
    }

    @Override
    public List<Owner> findAll() {
        return ownerService.findAll();
    }

    @Override
    public void deleteById(Long id) {
ownerService.deleteById(id);
    }

    @Override
    public Owner update(Long id, Owner owner) {
        return ownerService.update(id, owner);
    }

    @Override
    public Owner findByEmail(String email) {
        return ownerService.findByEmail(email);
    }

    @Override
    public void ownerAndHouse() {
       ownerService.ownerAndHouse();
    }
}