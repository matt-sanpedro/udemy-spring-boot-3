package com.luv2code.cruddemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/*
 * Add @Repository annotation to indicate that this class is a Data Access Object (DAO)
 *      - supports CRUD operations and components scanning
 *      - translates JDBC exceptions
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field for entity manager
    private EntityManager entityManager;

    /*
     * inject entity manager using constructor injection (generate the constructor)
     * the @Autowired annotation is optional if there is only one constructor
     */
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /*
     * implement save method (generate the method)
     * must add @Transactional annotation to manage transactions (perform update to the database)
     */
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

}
