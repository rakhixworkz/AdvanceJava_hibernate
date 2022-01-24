package com.xworkz.nursery.service;

import java.util.List;

import javax.naming.InvalidNameException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.nursery.dao.NurseryDAO;
import com.xworkz.nursery.entity.NurseryEntity;
import com.xworkz.nursery.service.exception.InvalidAge;
import com.xworkz.nursery.service.exception.InvalidEmail;
import com.xworkz.nursery.service.exception.InvalidName;
import com.xworkz.util.SingletonEmf;

public class NurseryServiceImpl implements NurseryService{

	@Override
	public void validateAndSave(NurseryEntity entity) {
		EntityManager manager=SingletonEmf.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		try {
			if(entity.getChildName().length()>3 && entity.getChildName()==null) {
				throw new InvalidName("Invalid name");
			}
			if(entity.getChildAge()>5) {
				throw new InvalidAge("Invalid Age");
			}
			if(entity.getEmail().contains(null)) {
				throw new InvalidEmail("Email address not found");
			}
		}
		catch(InvalidName e) {
				e.printStackTrace();
		}
		catch (InvalidAge e) {
			e.printStackTrace();
		
		}catch (InvalidEmail e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null) {
				manager.close();
			}
		}
	}

	

}
