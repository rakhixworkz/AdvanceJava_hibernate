package com.xworkz.product.dao;

import java.util.List;

import com.xworkz.product.entity.ProductEntity;

public interface ProductDAO {
	
	void persist(ProductEntity entity);
	void saveAll(List<ProductEntity> entities);
	List<ProductEntity> getAll();
	List<Integer> getBypriceGreaterThan(Integer price);

	List<Integer> getBypriceLesserThan(Integer price);
	ProductEntity getByNameAndId(String name,int id);
	int getMaxPrice();
	int getTotalPrice();
	String getByNamelike(String name);
	Object getQuantityByName(String name);
	Object[] getQuantityAndPriceByName(String name);
	Object[] getQuantityAndPriceByNameAndId(String name, int id);
	String getByBrand(String brand);
	List<Object[]> getNameAndPrice();
	Object[] getNameAndPriceByBrand(String brand);
	String getBrand(String name);
	 
}
