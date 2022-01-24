package com.xworkz.product;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class ProductScanner {

	public static void main(String[] args) {
		List<ProductEntity> productEntities = new ArrayList<ProductEntity>();
		productEntities.add(new ProductEntity("faceWash", 5, "Mamasearth", 220, "4"));
		productEntities.add(new ProductEntity("cream", 4, "lakme", 220, "4"));
		productEntities.add(new ProductEntity("cream", 5, "Mamasearth", 220, "4"));
		productEntities.add(new ProductEntity("cream", 5, "loreal", 220, "4"));
		productEntities.add(new ProductEntity("cream", 5, "garnier", 220, "4"));
		productEntities.add(new ProductEntity("faceWash", 5, "loreal", 220, "4"));
		productEntities.add(new ProductEntity("Bag", 100, "wildcraft", 1000, "5"));
		productEntities.add(new ProductEntity("T-shirt", 5, "H&m", 1500, "7"));
		productEntities.add(new ProductEntity("Phone", 7, "Realme", 22000, "8"));
		productEntities.add(new ProductEntity("charger", 5, "MI", 1200, "7"));
		ProductDAO dao = new ProductDAOImpl();
		dao.saveAll(productEntities);
		
		System.out.print(dao.getAll());
		System.out.println("****************");
		dao.getBypriceGreaterThan(1000);
		System.out.println("****************");
		dao.getBypriceLesserThan(22000);
		System.out.println("****************");
		dao.getBrand("loreal");
		System.out.println("****************");
		dao.getByBrand("facewash");
		System.out.println("****************");
		dao.getBypriceGreaterThan(22000);
		System.out.println("****************");
		dao.getByBrand("Realme");
		System.out.println("****************");
		dao.getByBrand("MI");
		System.out.println("****************");
		dao.getNameAndPrice();
		System.out.println("****************");
		dao.getNameAndPriceByBrand("H&M");
		System.out.println("****************");
		dao.getByNameAndId("facewash", 2);
		dao.getByNamelike("cream");
		System.out.println("****************");
		dao.getMaxPrice();

	}

}
