package com.xworkz.City.dao;

import com.xworkz.City.entity.CityEntity;

public interface CityDAO {
	void create(CityEntity entity);
	default void updateById(String name,int id) {
		
	}
	default void deleteById(int id) {
		
	}
}
