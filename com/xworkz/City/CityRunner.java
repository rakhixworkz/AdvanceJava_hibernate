package com.xworkz.City;

import com.xworkz.City.dao.CityDAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.SQLException;
import com.xworkz.City.dao.CityDAOImpl;
import com.xworkz.City.entity.CityEntity;

public class CityRunner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		CityEntity cityentity=new CityEntity(1,"Munger", "5000", "clothes","Red");
		CityDAO dao=new CityDAOImpl();
		dao.create(cityentity);
		
	}

}
