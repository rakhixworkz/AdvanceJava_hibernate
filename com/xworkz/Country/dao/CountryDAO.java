package com.xworkz.Country.dao;

import com.xworkz.Country.entity.CountryEntity;
import com.xworkz.company.entity.CompanyEntity;

public interface CountryDAO {
	void create(CountryEntity entity1);
	default CountryEntity getById(int id) {
		return null;
	}
	default void updateById(String name,int id) {
		
	}
	default void deleteById(int id) {
		
	}
}
