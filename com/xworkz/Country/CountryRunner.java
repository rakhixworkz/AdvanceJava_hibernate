package com.xworkz.Country;

import com.xworkz.Country.dao.CountryDAO;
import com.xworkz.Country.dao.CountryDAOImpl;
import com.xworkz.Country.entity.CountryEntity;

public class CountryRunner {

	public static void main(String[] args) {
		CountryEntity countryEntity=new CountryEntity(1,"india","Asia",32910l);
		CountryDAO dao=new CountryDAOImpl();
		dao.create(countryEntity);
		
	}

}
