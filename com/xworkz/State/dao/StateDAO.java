package com.xworkz.State.dao;

import com.xworkz.State.entity.StateEntity;
import com.xworkz.company.entity.CompanyEntity;

public interface StateDAO {
	void create(StateEntity entity3);
	default StateEntity getById(int id) {
		return null;
	}
	default void updateById(String name,int id) {
		
	}
	default void deleteById(int id) {
		
	}
}
