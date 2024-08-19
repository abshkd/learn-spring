package com.example.myapp.dao;

import com.example.myapp.entity.Bot;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BotDAOImpl implements BotDAO {

    // 1. Define fields for Em
    private EntityManager entityManager;


    // 2. Inject EM with constructor
    @Autowired
    public BotDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Bot theBot) {
        entityManager.persist((theBot));
    }
}
