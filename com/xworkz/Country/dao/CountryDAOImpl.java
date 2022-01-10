package com.xworkz.Country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Country.entity.CountryEntity;
import com.xworkz.company.entity.CompanyEntity;

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
	@Override
	public CountryEntity getById(int id) {
		CountryEntity countryentity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument " + id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			countryentity = session.get(CountryEntity.class, id);
			if (countryentity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return countryentity;
	}

	@Override
	public void updateById(String name, int id) {
		System.out.println("invode by id and update");

		System.out.println("passing arg " + name + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			CountryEntity entity = session.get(CountryEntity.class, id);
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

		SessionFactory factory= new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			CompanyEntity entity=session.get(CompanyEntity.class, id);
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
