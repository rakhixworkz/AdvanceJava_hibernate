package com.xworkz.airport;

import java.util.List;
import java.util.ArrayList;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportTester {

	public static void main(String[] args) {
		//AirportEntity entity=new AirportEntity(1,"karnataka","Kempegowda International Airport","Jayprakash Narayan International Airport",8000);
		//AirportEntity entity1=new AirportEntity(2,"Bihar","Jayprakash Narayan International Airport","Kempegowda International Airport",8000);
		//AirportDAO dao=new AirportDAOImpl();
		//dao.put(entity);
		//dao.put(entity1);
		List<AirportEntity> airportEntities=new ArrayList<AirportEntity>();
		//airportEntities.add(new AirportEntity(3,"DonaKonda","Donakonda Airport","kadapa Airport",3000));
		//airportEntities.add(new AirportEntity(4,"kadapa","kadapa Airport","Donakonda Airport",4000));
		//airportEntities.add(new AirportEntity(5,"kuppam","kuppam Airport","kurnool",3322));
		//airportEntities.add(new AirportEntity(6,"kurnool","kurnool Airport","kadapa Airport",4440));
		//airportEntities.add(new AirportEntity(7,"NagarJunaSagar","Nagar junaSagar Airport","kadapa Airport",3400));
		//airportEntities.add(new AirportEntity(8,"Nellore","Donakonda Airport","kadapa Airport",2000));
		//airportEntities.add(new AirportEntity(9,"puttaparthi","SriSathya Sai Airport","kadapa Airport",4500));
		//airportEntities.add(new AirportEntity(10,"Rajahmundry","Rajmundri Airport","kadapa Airport",3500));
		//airportEntities.add(new AirportEntity(11,"Tirupati","Tirupati Airport","kadapa Airport",12000));
		//airportEntities.add(new AirportEntity(12,"vijayawada","Vijayawada Airport","kadapa Airport",3300));
		//airportEntities.add(new AirportEntity(13,"visakhapatnam","Visakhapatnam Airport","kadapa Airport",8000));
		airportEntities.add(new AirportEntity(14,"Patna","  Jayprakash Narayan International Airport","Kuppam Airport",2300));
		airportEntities.add(new AirportEntity(15,"Daporijo","Daporijo Airport","itanagar Airport",4500));
		airportEntities.add(new AirportEntity(16,"Itanagar","Itanagar Airport","kadapa Airport",3000));
		airportEntities.add(new AirportEntity(17,"pasighat","pasighat Airport","tezu Airport",4000));
		airportEntities.add(new AirportEntity(18,"Tawang","tawang Airport","chakulia Airport",6000));
		airportEntities.add(new AirportEntity(19,"Tezu","tezu Airport","kadapa Airport",7000));
		airportEntities.add(new AirportEntity(20,"Tuting","Tuting Airport","kadapa Airport",8000));
		airportEntities.add(new AirportEntity(21,"walong","walong Airport","kadapa Airport",4400));
		airportEntities.add(new AirportEntity(22,"ziro","ziro Airport","kadapa Airport",7000));
		airportEntities.add(new AirportEntity(23,"chabua","chubua Airport","kadapa Airport",3700));
		airportEntities.add(new AirportEntity(24,"Dhubri","dhubri Airport","kadapa Airport",3800));
		airportEntities.add(new AirportEntity(25,"Dibrugarh","Dibrugarh Airport","kadapa Airport",3080));
		airportEntities.add(new AirportEntity(26,"Dinjan","dinjan Airport","kadapa Airport",3800));
		airportEntities.add(new AirportEntity(27,"Doom Dooma","doom Airport","kadapa Airport",6700));
		airportEntities.add(new AirportEntity(28,"Guwahati","Guwahati Airport","kadapa Airport",3700));
		airportEntities.add(new AirportEntity(29,"Jorhat","jorhat Airport","kadapa Airport",6500));
		airportEntities.add(new AirportEntity(30,"North Lakhimpur","Lakhimpur Airport","kadapa Airport",770));
		airportEntities.add(new AirportEntity(31,"silchar","silchar Airport","kadapa Airport",8800));
		airportEntities.add(new AirportEntity(32,"tezpur","tezpur Airport","kadapa Airport",3800));
		airportEntities.add(new AirportEntity(33,"Ahmedabad","Ahmedabad Airport","kadapa Airport",3900));
		airportEntities.add(new AirportEntity(34,"Dharamshala Kangra","dharamshala Airport","kadapa Airport",3000));
		airportEntities.add(new AirportEntity(35,"kullu manali","kullu Airport","kadapa Airport",4700));
		airportEntities.add(new AirportEntity(36,"mandi","mandi Airport","kadapa Airport",3000));
		airportEntities.add(new AirportEntity(37,"shimla","shimla Airport","kadapa Airport",5600));
		airportEntities.add(new AirportEntity(38,"Bokaro","Bellary Airport","mandi Airport",3600));
		airportEntities.add(new AirportEntity(39,"chakulia","chakulia Airport","dharamshala Airport",3600));
		airportEntities.add(new AirportEntity(40,"Dhanbad","Donakonda Airport","kadapa Airport",3890));
		airportEntities.add(new AirportEntity(41,"Ranchi","Donakonda Airport","Bellary",3900));
		airportEntities.add(new AirportEntity(42,"Bellary","Donakonda Airport","kadapa Airport",3970));
		airportEntities.add(new AirportEntity(43,"kannur","Donakonda Airport","kadapa Airport",3800));
		airportEntities.add(new AirportEntity(44,"kochi","Bhopal","kozhikode malappuram",3700));
		airportEntities.add(new AirportEntity(45,"kozhikode malappuram","Donakonda Airport","kadapa Airport",8970));
		airportEntities.add(new AirportEntity(46,"Thiruvananthapuram","kozhikode malappuram","kadapa Airport",3600));
		airportEntities.add(new AirportEntity(47,"Bhopal","Donakonda Airport","kadapa Airport",5600));
		airportEntities.add(new AirportEntity(48,"Gwalior","Gwalior Airport","kadapa Airport",5400));
		AirportDAO dao1=new AirportDAOImpl();
		dao1.putAll(airportEntities);
		
		
		
		
		
		
	}

}
