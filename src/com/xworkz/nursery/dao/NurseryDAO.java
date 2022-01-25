package com.xworkz.nursery.dao;

import java.util.List;

import com.xworkz.nursery.entity.NurseryEntity;

public interface NurseryDAO {
	void saveAll(List<NurseryEntity> entities);
	void save(NurseryEntity entity);

}
