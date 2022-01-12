package com.xworkz.railwayStation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

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

}
