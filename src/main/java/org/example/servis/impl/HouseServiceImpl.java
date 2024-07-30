package org.example.servis.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.databese.HibernateConfig;
import org.example.entity.Customer;
import org.example.entity.House;
import org.example.servis.CustomerService;
import org.example.servis.HouseService;

import java.util.List;

public class HouseServiceImpl implements HouseService {
EntityManagerFactory    entityManagerFactory = HibernateConfig.getEntityManagerFactory();
    @Override
    public House saveOrUpdate(House house) {
        try {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(house);
            entityManager.getTransaction().commit();
            entityManager.close();
            return house;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public House findById(Long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            House house = entityManager.find(House.class, id);
            entityManager.getTransaction().commit();
            entityManager.close();
            return house;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<House> findAll() {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            List<House> houses = entityManager.createQuery("from House").getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
            return houses;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            House house = entityManager.find(House.class, id);
            entityManager.remove(house);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public House update(Long id,House house) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            House house1 = entityManager.find(House.class, id);
            house1.setHouseTypeHouseType(house.getHouseTypeHouseType());
            house1.setFurniture(house.isFurniture());
            house1.setPrice(house.getPrice());
            house1.setRating(house.getRating());
            house1.setRoom(house.getRoom());
            house1.setDescription(house.getDescription());
            entityManager.getTransaction().commit();
            entityManager.close();
            return house;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}