package com.xworkz.State.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.State.entity.StateEntity;

public class StateDAOImpl implements StateDAO{

	@Override
	public void create(StateEntity entity3) {
		System.out.println("Invoked create dao method");
		System.out.println(entity3);
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory factory=configuration.buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(entity3);
			tx.commit();
			session.close();
		}
		factory.close();
	}

}
