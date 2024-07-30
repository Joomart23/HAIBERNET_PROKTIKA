package org.example.servis.impl;

import org.example.entity.Rent_info;
import org.example.servis.Rent_infoService;

import java.util.List;

public class Rent_infoServiceImpl implements Rent_infoService {
    @Override
    public Rent_info saveOrUpdate(Rent_info rentInfo) {
        return null;
    }

    @Override
    public List<Rent_info> findById(Long id) {
        return List.of();
    }

    @Override
    public List<Rent_info> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Rent_info update(Rent_info rentInfo) {
        return null;
    }

    @Override
    public List<Rent_info> findByCustomerId(Long customerId) {
        return List.of();
    }
}
