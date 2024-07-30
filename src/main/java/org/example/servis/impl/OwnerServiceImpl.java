package org.example.servis.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.databese.HibernateConfig;
import org.example.entity.Customer;
import org.example.entity.House;
import org.example.entity.Owner;
import org.example.servis.HouseService;
import org.example.servis.OwnerService;

import java.util.List;

public class OwnerServiceImpl implements OwnerService {
private final EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManagerFactory();
    @Override
    public Owner saveOrUpdate(Owner owner) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(owner);
            entityManager.getTransaction().commit();
            entityManager.close();
            return owner;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Owner findById(Long id) {
        try {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Owner owner = entityManager.find(Owner.class, id);
            entityManager.getTransaction().commit();
            entityManager.close();
            return owner;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Owner> findAll() {
        try {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Owner> owners = entityManager.createQuery("from Owner").getResultList();
        return owners;
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
            Owner owner = entityManager.find(Owner.class, id);
            entityManager.remove(owner);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Owner update(Long id,Owner owner) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Owner owner1 = entityManager.find(Owner.class, id);
            owner1.setEmail(owner.getEmail());
            owner1.setFirstName(owner.getFirstName());
            owner1.setLastName(owner.getLastName());
            owner1.setDateOfBirth(owner.getDateOfBirth());
            owner1.setGonger(owner.getGonger());
            return owner;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Owner findByEmail(String email) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Owner owner = entityManager.find(Owner.class, email);
            entityManager.getTransaction().commit();
            entityManager.close();
            return owner;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void ownerAndHouse() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
      Owner owner=  entityManager.createQuery("select o from Owner o", Owner.class).getSingleResult();
           System.out.println(owner);
  //    Owner owner1 =   entityManager.createQuery("select concat(o.id  ,  h.id)  from Owner  o inner join House h ", Owner.class).getSingleResult();
     //   System.out.println(owner1);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}