package org.example.dao.impl;

import org.example.dao.Rent_infoDao;
import org.example.entity.Rent_info;

import java.util.List;

public class Rent_infoDaoImpl implements Rent_infoDao {
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
