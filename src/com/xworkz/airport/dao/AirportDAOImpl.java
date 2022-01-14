package com.xworkz.airport.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.tour.util.EMFUtil;

public class AirportDAOImpl implements AirportDAO{

	@Override
	public void put(AirportEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

	@Override
	public void putAll(List<AirportEntity> entites) {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		for (AirportEntity airportEntity : entites) {
			manager.persist(airportEntity);
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			int flushCount=0;
			try {
				for(int i=0;i<48;i++) {
					if(flushCount==20) {
						manager.flush();
						flushCount=0;
						manager.clear();
					}
				}
				manager.flush();
				flushCount++;
			}catch (PersistenceException e) {
				
				e.printStackTrace();
				tx.rollback();
			}
			tx.commit();
			
		}
		
	}

}
