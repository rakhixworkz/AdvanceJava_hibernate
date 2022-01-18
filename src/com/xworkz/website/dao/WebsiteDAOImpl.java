package com.xworkz.website.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.util.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO{

	@Override
	public void save(WebsiteEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}

	@Override
	public void putAll(List<WebsiteEntity> entity) {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		int flushCount=0;
		try {
				for (WebsiteEntity websiteEntity : entity) {
						manager.persist(websiteEntity);
						if(flushCount>=10) {
							manager.flush();
							flushCount=0;
							manager.clear();
							System.out.println("Data is flushing");
							
							
						}
						flushCount++;
				}tx.commit();
						
		}catch(PersistenceException e) {
			e.getMessage();
			tx.rollback();
			
			
		}
		
	}
}
