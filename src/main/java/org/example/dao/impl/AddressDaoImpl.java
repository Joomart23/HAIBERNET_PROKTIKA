package org.example.dao.impl;

import org.example.dao.AddressDao;
import org.example.entity.Address;
import org.example.entity.Agency;
import org.example.servis.impl.AddressServiceImpl;

import java.util.List;

public class AddressDaoImpl implements AddressDao {
private final AddressServiceImpl addressService = new AddressServiceImpl();
    @Override
    public Address saveOrUpdate(Address address) {
        return addressService.saveOrUpdate(address);
    }

    @Override
    public Address findById(Long id) {
        return addressService.findById(id);
    }

    @Override
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @Override
    public void deleteById(Long id) {
        addressService.deleteById(id);

    }

    @Override
    public Address update(Long id ,Address address) {
        return addressService.update(id,address);
    }

    @Override
    public Address findByCity(String city) {
        return addressService.findByCity(city);
    }

    @Override
    public void  getAgencyByAdress() {
        addressService.getAgencyByAdress();
    }

    @Override
    public void getAgencyByCity(String city) {
        addressService.getAgencyByCity(city);
    }
}
