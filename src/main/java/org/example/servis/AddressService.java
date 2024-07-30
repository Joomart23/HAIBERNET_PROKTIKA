package org.example.servis;

import org.example.entity.Address;
import org.example.entity.Agency;

import java.util.List;
import java.util.Map;

public interface AddressService {
    Address saveOrUpdate(Address address);
    Address findById(Long id);
    List<Address> findAll();
    void deleteById(Long id);
    Address update( Long id ,Address Newaddress);
    Address findByCity(String city);
    void getAgencyByAdress();
    void  getAgencyByCity(String city);
    Map<String, List<Agency>> groupByRegion();
}



