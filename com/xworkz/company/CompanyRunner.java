package com.xworkz.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDAOImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyRunner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CompanyEntity companyEntity=new CompanyEntity(1, "xworkz", "IT", "MNC","www.abc");
		CompanyDAO dao=new CompanyDAOImpl();
		dao.create(companyEntity);
		
		//Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Bhai@123");
	//System.out.println(connection);
	}

}
