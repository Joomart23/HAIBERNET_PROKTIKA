package org.example.dao.impl;

import org.example.dao.AgencyDao;
import org.example.entity.Address;
import org.example.entity.Agency;
import org.example.servis.impl.AgencyServiceImpl;

import java.util.List;
import java.util.Optional;

public class AgencyDaoImpl implements AgencyDao {
private final AgencyServiceImpl agencyService = new AgencyServiceImpl();
    @Override
    public Agency saveOrUpdate(Agency agency) {
        return agencyService.saveOrUpdate(agency);
    }

    @Override
    public Agency findById(Long id) {
        return agencyService.findById(id);
    }

    @Override
    public List<Agency> findAll() {
        return agencyService.findAll();
    }

    @Override
    public void deleteById(Long id) {
        agencyService.deleteById(id);

    }

    @Override
    public Agency update(Long id,Agency agency) {
        return agencyService.saveOrUpdate(agency);
    }

    @Override
    public Agency  findByName(String name) {
        return agencyService.findByName(name);
    }
}
