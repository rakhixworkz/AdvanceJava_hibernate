package com.xworkz.nursery.service;

import com.xworkz.nursery.dao.NurseryDAO;
import com.xworkz.nursery.dao.NurseryDAOImpl;
import com.xworkz.nursery.entity.NurseryEntity;

public class NurseryServiceImpl implements NurseryService{	
	
	//NurseryDAO dao=new NurseryDAOImpl();
	 private NurseryDAO dao;
	 public NurseryServiceImpl(NurseryDAO dao) {
		this.dao=dao;
	}
	boolean valid = true;
	@Override
	public boolean validateAndSave(NurseryEntity entity) {

		if(entity.getChildName()!=null && entity.getChildName().length()>3 && entity.getChildName().length()<20) {
			
		}
		else {
			System.out.println("Invalid name");
			return false;
		}
		if(entity.getFatherName()!=null && entity.getFatherName().length()>5) {
			
		}
		else {
			System.out.println("Invalid father's name");
			return false;
		}
		if(entity.getEmail().contains("@") && entity.getEmail().contains(".com")) {
			System.out.println("Email id is added successfully");
		}
		else {
			System.out.println("Invalid email");
			return false;
		}
		if(entity.getChildAge()!=0 && entity.getChildAge()<6) {
			
		}
		else {
			System.out.println("Invalid Age");
			return false;
		}
		if(entity.getCreatedBy()!=null) {
			
		}
		else {
			System.out.println("Invalid");
			return false;
		}
		if(entity.getCreatedAt()!=null) {
			
		}
		else {
			System.out.println("Invalid");
			return false;
		}
		if(valid)dao.save(entity);
		return false;
	}
}
