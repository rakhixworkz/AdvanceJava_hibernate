package com.xworkz.railwayStation.dao;

import java.util.List;
import com.xworkz.railwayStation.entity.RailwayStationEntity;

public interface RailwayStationDAO {
	void put(RailwayStationEntity entity);
	void putAll(List<RailwayStationEntity> railwayStationEntities);
}
