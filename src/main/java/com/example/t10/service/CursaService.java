package com.example.t10.service;

import com.example.t10.entity.Cursa;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Transactional
@Repository
public class CursaService implements ICursa {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Cursa> findAll() {
       boolean b= TransactionSynchronizationManager.isActualTransactionActive();
      List<Cursa> list=entityManager.createQuery("from Cursa",Cursa.class).getResultList();
      return list;
    }
}
