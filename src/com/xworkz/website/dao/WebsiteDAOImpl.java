package com.xworkz.website.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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

	@Override
	public WebsiteEntity getByNameGoogle() {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByNameGoogle");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity)obj;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByLikeUrlx() {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByLikeUrlx");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity)obj;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByMinSince() {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByMinSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity)obj;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByMaxSince() {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getByMaxSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity)obj;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getBySecondMinSince() {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getBySecondMinSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity)obj;
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getSecondMaxSince() {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=manager.createNamedQuery("getSecondMaxSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity)obj;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
}
