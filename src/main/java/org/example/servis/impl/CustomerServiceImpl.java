package org.example.servis.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import org.example.databese.HibernateConfig;
import org.example.entity.Customer;
import org.example.entity.Owner;
import org.example.entity.Rent_info;
import org.example.servis.CustomerService;
import org.example.servis.OwnerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManagerFactory();

    @Override
    public Customer saveOrUpdate(Customer customer) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    @Override
    public Customer findById(Long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Customer customer = entityManager.find(Customer.class, id);
            entityManager.getTransaction().commit();
            entityManager.close();
            return customer;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            List<Customer> customers = entityManager.createQuery("from Customer").getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
            return customers;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteById(Long id){
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Customer customer = entityManager.find(Customer.class, id);
            entityManager.remove(customer);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (
                Exception e
        ){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Customer update(Long id, Customer customer) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Customer customer1 = entityManager.find(Customer.class, id);
            customer.setDaeOfBirth(customer1.getDaeOfBirth());
            customer.setEmail(customer.getEmail());
            customer.setFirsName(customer.getFirsName());
            customer.setLastName(customer.getLastName());
            return customer;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Customer findByEmail(String email) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Customer customer = entityManager.find(Customer.class, email);
            entityManager.getTransaction().commit();
            entityManager.close();
            return customer;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void getRent_iNFO(String  lastname ) {
        EntityManager entityManager=  HibernateConfig.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();;
    Rent_info rentInfo =  entityManager.createQuery("select r from Rent_info" +
            " r inner join Customer c on  r.id=c.id" +
            " where r.Name= :lastnmae", Rent_info.class)
            .setParameter("lastnmae", lastname)
            .getSingleResult();
        entityManager.remove(rentInfo);
        entityManager.getTransaction().commit();
        entityManager.close();


    }
}