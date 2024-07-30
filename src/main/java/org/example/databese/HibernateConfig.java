package org.example.databese;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entity.*;
import org.hibernate.HibernateException;
import org.hibernate.QueryException;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;
import java.util.concurrent.Callable;

public class HibernateConfig {

    public static EntityManagerFactory getEntityManagerFactory() {
        Configuration configuration = new Configuration();
        try {
            configuration.setProperty(Environment.JAKARTA_JDBC_DRIVER, "org.postgresql.Driver");
            configuration.setProperty(Environment.JAKARTA_JDBC_URL, "jdbc:postgresql://localhost:5432/postgres");
            configuration.setProperty(Environment.JAKARTA_JDBC_USER, "postgres");
            configuration.setProperty(Environment.JAKARTA_JDBC_PASSWORD, "postgres");
            configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
            configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            configuration.setProperty(Environment.SHOW_SQL, "true");
            configuration.addAnnotatedClass(Agency.class);
            configuration.addAnnotatedClass(Owner.class);
            configuration.addAnnotatedClass(Rent_info.class);
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(Address.class);
            configuration.addAnnotatedClass(House.class);
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
    }
}