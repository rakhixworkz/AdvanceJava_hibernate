package com.xworkz.City.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.xworkz.City.entity.CityEntity;



public class CityDAOImpl implements CityDAO{

	@Override
	public void create(CityEntity entity) {
		System.out.println("Invoked create dao method");
		System.out.println(entity);
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CityEntity.class);
		SessionFactory factrory=configuration.buildSessionFactory();
		if(factrory!=null) {
			Session session=factrory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(entity);
			tx.commit();
			session.close();
		}
		factrory.close();
	}

	
}
