package org.example.servis.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.databese.HibernateConfig;
import org.example.entity.Address;
import org.example.entity.Agency;
import org.example.servis.AgencyService;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class AgencyServiceImpl implements AgencyService {
  private final   EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManagerFactory();
    @Override
    public Agency saveOrUpdate(Agency agency) {
     final  EntityManager entityManager =    entityManagerFactory.createEntityManager();
        try {
            if(!agency.getPhoneNumber().startsWith("+996")){
                throw new HibernateException("Phone number must start with +996");
            }
            entityManager.getTransaction().begin();
            entityManager.persist(agency);
            entityManager.getTransaction().commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
return agency;
    }

     @Override
    public Agency findById(Long id) {
        try {
            EntityManager entityManager1 = entityManagerFactory.createEntityManager();
            entityManager1.getTransaction().begin();
            Agency agency = entityManager1.find(Agency.class, id);
            entityManager1.getTransaction().commit();
            entityManager1.close();
            return agency;
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Agency> findAll() {
        try {
            EntityManager entityManager1 = entityManagerFactory.createEntityManager();
            entityManager1.getTransaction().begin();
          List<Agency> agencies=   entityManager1.createQuery("select s from Agency s ").getResultList();
          entityManager1.getTransaction().commit();
          entityManager1.close();
          return agencies;
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        try {
            EntityManager entityManager1 = entityManagerFactory.createEntityManager();
            entityManager1.getTransaction().begin();
            Agency agency = entityManager1.find(Agency.class, id);
            entityManager1.remove(agency);
            System.out.println(agency);
            entityManager1.getTransaction().commit();
            entityManager1.close();
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public Agency update(Long id  ,Agency agency) {
        try {
            EntityManager entityManager1 = entityManagerFactory.createEntityManager();
            entityManager1.getTransaction().begin();
            Agency agency1 = entityManager1.find(Agency.class, id);
            agency1.setName(agency.getName());
            entityManager1.getTransaction().commit();
            return agency1;
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Agency findByName(String lastname) {
        try {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
       Agency agency =  entityManager1.find(Agency.class, lastname);
       entityManager1.getTransaction().commit();
       entityManager1.close();
        return agency;
    }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
