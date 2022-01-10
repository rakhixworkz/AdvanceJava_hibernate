package com.xworkz.Patient.dao;

import com.xworkz.Patient.entity.PatientEntity;
import com.xworkz.company.entity.CompanyEntity;

public interface PatientDAO {
	void create(PatientEntity entity2);
	default PatientEntity getById(int id) {
		return null;
	}
	default void updateById(String name,int id) {
		
	}
	default void deleteById(int id) {
		
	}
}
