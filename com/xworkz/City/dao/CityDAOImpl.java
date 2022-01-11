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
	@Override
	public CityEntity getById(int id) {
		CityEntity cityentity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument " + id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			cityentity = session.get(CityEntity.class, id);
			if (cityentity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return cityentity;
	}

	@Override
	public void updateById(String name, int id) {
		System.out.println("invode by id and update");

		System.out.println("passing arg " + name + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) {

				entity.setName(name);
				session.update(entity);
				tran.commit();
				System.out.println("entity updated");
				session.close();

			} else {
				System.out.println("not found wrong passing");
			}
			factory.close();

		}
	}
	@Override
	public void deleteById(int id) {
		System.out.println("invoked delete by id");

		SessionFactory factory= new Configuration().configure().addAnnotatedClass(CityEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			CityEntity entity=session.get(CityEntity.class, id);
			if(entity!=null) {
				session.delete(entity);
				transaction.commit();
				System.out.println("you are genius found that and deleted");
				session.close();
			}else {
				System.out.println("not found that id");
			}
		}factory.close();

	}
	

	
}
