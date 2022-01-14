package com.xworkz.railwayStation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.railwayStation.entity.RailwayStationEntity;
import com.xworkz.tour.util.EMFUtil;

public class RailwaystationDAOImpl implements RailwayStationDAO{

	@Override
	public void put(RailwayStationEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

	@Override
	public void putAll(List<RailwayStationEntity> railwayStationEntities) {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		for (RailwayStationEntity railwayStationEntity : railwayStationEntities) {
			manager.persist(railwayStationEntity);
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
