package com.xworkz.Country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Country.entity.CountryEntity;

public class CountryDAOImpl implements CountryDAO{

	@Override
	public void create(CountryEntity entity1) {
		System.out.println("Invoked create dao method ");
		System.out.println(entity1);
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CountryEntity.class);
		SessionFactory factory=configuration.buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(entity1);
			session.close();
		}
		factory.close();
	}

}
