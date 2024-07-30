package org.example.servis.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.databese.HibernateConfig;
import org.example.entity.Address;
import org.example.entity.Agency;
import org.example.servis.AddressService;
import org.example.servis.HouseService;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AddressServiceImpl implements AddressService {
    EntityManagerFactory entityManagerFactory =  HibernateConfig.getEntityManagerFactory();
    @Override
    public Address saveOrUpdate(Address address) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(address);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return address;
    }

    @Override
    public Address findById(Long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Address address = entityManager.find(Address.class, id);
            entityManager.getTransaction().commit();
            entityManager.close();
            return address;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Address> findAll() {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            List<Address> addresses = entityManager.createQuery("from Address").getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
            return addresses;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  null;
    }

    @Override
    public void deleteById(Long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Address address = entityManager.find(Address.class, id);
            entityManager.remove(address);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Address update(Long id,Address newaddress) {
        try {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Address address1 = entityManager.find(Address.class, id);
            newaddress.setCity(address1.getCity());
            newaddress.setStreet(address1.getStreet());
            return newaddress;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Address findByCity(String city) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
      Address    addresses =   entityManager.createQuery(" select a from Address a where city = :city",
              Address.class).setParameter("city",city).getSingleResult();
      entityManager.getTransaction().commit();
      entityManager.close();
        return addresses;
    }

    @Override
    public void getAgencyByAdress() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Address> resultList = entityManager.createQuery("select concat(a.id,'            ',ad.city)" +
                " from Agency a inner join Address ad on  ad.id=a.id").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(resultList);
    }

    @Override
    public void getAgencyByCity(String city) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Long count = entityManager.createQuery("select  count (a) from Agency a inner  join " +
                " Address  ad on " +
                " ad.id=a.id where ad.city = :city",
                Long.class).setParameter
                ("city",city).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(count);

    }

    @Override
    public Map<String, List<Agency>> groupByRegion() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("select concat(ad.id,'           ',a.address) from Agency a inner join Address  ad on ad.id=a.id").getResultList();
        return null;
    }

    }