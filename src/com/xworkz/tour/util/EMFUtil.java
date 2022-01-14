package com.xworkz.tour.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
	private static EntityManagerFactory entityManagerFactory;
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	static {
		System.out.println("Invoked static block");
		entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz.tour");
		System.out.println("initialized values to db");
		
	}

}
