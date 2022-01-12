package com.xworkz.railwayStation;

import com.xworkz.railwayStation.dao.RailwayStationDAO;
import com.xworkz.railwayStation.dao.RailwaystationDAOImpl;
import com.xworkz.railwayStation.entity.RailwayStationEntity;

public class RailwayStationRunner {

	public static void main(String[] args) {
		RailwayStationEntity entity=new RailwayStationEntity(1,"Patna",7,9,"Bhagalpur","Patna",500);
		RailwayStationDAO dao=new RailwaystationDAOImpl();
		dao.put(entity);
	}

}
