package com.xworkz.railwayStation;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.railwayStation.dao.RailwayStationDAO;
import com.xworkz.railwayStation.dao.RailwaystationDAOImpl;
import com.xworkz.railwayStation.entity.RailwayStationEntity;

public class RailwayStationRunner {

	public static void main(String[] args) {
		List<RailwayStationEntity> railwayStationEntities = new ArrayList<RailwayStationEntity>();

		railwayStationEntities.add(new RailwayStationEntity(1, "Patna", 7, 9, "Bhagalpur", "Patna", 5500));
		railwayStationEntities.add(new RailwayStationEntity(2, "Bengaluru", 7, 9, "BJ", "Bengaluru", 4500));
		railwayStationEntities.add(new RailwayStationEntity(3, "Yehwanthpur", 7, 9, "YJ", "Patna", 6500));
		railwayStationEntities.add(new RailwayStationEntity(4, "Mysore", 7, 9, "MJ", "Patna",9500));
		railwayStationEntities.add(new RailwayStationEntity(5, "Bangarpet", 7, 9, "BJ", "Patna",7500));
		railwayStationEntities.add(new RailwayStationEntity(6, "Raichur", 7, 9, "RJ", "Patna", 8500));
		railwayStationEntities.add(new RailwayStationEntity(7, "Manglore", 7, 9, "MJ", "Patna", 6500));
		railwayStationEntities.add(new RailwayStationEntity(8, "Hubli", 7, 9, "HJ", "Patna",6600));
		railwayStationEntities.add(new RailwayStationEntity(9, "Davanagere", 7, 9, "DJ", "Patna",8800));
		railwayStationEntities.add(new RailwayStationEntity(10, "Birur", 7, 9, "BJ", "Patna",7700));
		railwayStationEntities.add(new RailwayStationEntity(11, "Wadi", 7, 9, "WJ", "Patna",8900));
		railwayStationEntities.add(new RailwayStationEntity(12, "Tumkur", 7, 9, "TJ", "Patna",9500));
		railwayStationEntities.add(new RailwayStationEntity(13, "Arsikere", 7, 9, "AJ", "Patna",8900));
		railwayStationEntities.add(new RailwayStationEntity(14, "Manglore", 7, 9, "MJ", "Patna",5500));
		railwayStationEntities.add(new RailwayStationEntity(15, "Bellary", 7, 9, "BJ", "Patna", 5200));
		railwayStationEntities.add(new RailwayStationEntity(16, "Belgaum", 7, 9, "BJ", "Patna",2200));
		railwayStationEntities.add(new RailwayStationEntity(17, "Yadgir", 7, 9, "YJ", "Patna",7700));
		railwayStationEntities.add(new RailwayStationEntity(18, "Mandya", 7, 9, "MJ", "Patna",2400));
		railwayStationEntities.add(new RailwayStationEntity(19, "Darwad", 7, 9, "DJ", "Patna",4400));
		railwayStationEntities.add(new RailwayStationEntity(20, "Hyderbad", 7, 9, "HJ", "Patna",2500));
		railwayStationEntities.add(new RailwayStationEntity(21, "Secundarabad", 7, 9, "SJ", "Patna",12500));
		railwayStationEntities.add(new RailwayStationEntity(22, "Warangal", 7, 9, "WJ", "Patna",5500));
		railwayStationEntities.add(new RailwayStationEntity(23, "Tandur", 7, 9, "TJ", "Patna",2345));
		railwayStationEntities.add(new RailwayStationEntity(24, "Basar", 7, 9, "BJ", "Patna", 5900));
		railwayStationEntities.add(new RailwayStationEntity(25, "Begampet", 7, 9, "BJ", "Patna", 9500));
		railwayStationEntities.add(new RailwayStationEntity(26, "Kanipet", 7, 9, "KJ", "Patna", 6700));
		railwayStationEntities.add(new RailwayStationEntity(27, "Kachagud", 7, 9, "Bhagalpur", "Patna", 3500));
		railwayStationEntities.add(new RailwayStationEntity(28, "Nalgonda", 7, 9, "NJ", "Patna",9000));
		railwayStationEntities.add(new RailwayStationEntity(29, "Tivim", 7, 9, "TJ", "Patna", 3500));
		railwayStationEntities.add(new RailwayStationEntity(30, "Kulem", 7, 9, "KJ", "Patna",5600));
		railwayStationEntities.add(new RailwayStationEntity(31, "Verma", 7, 9, "VJ", "Patna",2300));
		railwayStationEntities.add(new RailwayStationEntity(32, "Balli", 7, 9, "BJ", "Patna", 5200));
		railwayStationEntities.add(new RailwayStationEntity(33, "Kaleem", 7, 9, "KJ", "Patna",5500));
		railwayStationEntities.add(new RailwayStationEntity(34, "Hyderbad", 7, 9, "HJ", "Patna",2500));
		railwayStationEntities.add(new RailwayStationEntity(35, "Secundarabad", 7, 9, "SJ", "Patna", 7500));
		railwayStationEntities.add(new RailwayStationEntity(36, "Warangal", 7, 9, "WJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(37, "Tandur", 7, 9, "TJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(38, "Basar", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(39, "Begampet", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(40, "Kanipet", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(41, "Kachagud", 7, 9, "Bhagalpur", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(42, "Nalgonda", 7, 9, "NJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(43, "Tivim", 7, 9, "TJ", "Patna", 2500));
		railwayStationEntities.add(new RailwayStationEntity(44, "Kulem", 7, 9, "KJ", "Patna",6500));
		railwayStationEntities.add(new RailwayStationEntity(45, "Verma", 7, 9, "VJ", "Patna", 5899));
		railwayStationEntities.add(new RailwayStationEntity(46, "Balli", 7, 9, "BJ", "Patna",6780));
		railwayStationEntities.add(new RailwayStationEntity(47, "Kaleem", 7, 9, "KJ", "Patna",5670));
		railwayStationEntities.add(new RailwayStationEntity(48, "Mandya", 7, 9, "MJ", "Patna",7890));
		railwayStationEntities.add(new RailwayStationEntity(49, "rajesthan", 7, 9, "MJ", "Patna", 9500));
		railwayStationEntities.add(new RailwayStationEntity(50, "bellary", 7, 9, "MJ", "Patna",8900));
		railwayStationEntities.add(new RailwayStationEntity(51, "lakhimpur", 7, 9, "MJ", "Patna",6789));
		railwayStationEntities.add(new RailwayStationEntity(52, "kiul", 7, 9, "MJ", "Patna", 5009));
		railwayStationEntities.add(new RailwayStationEntity(53, "ratanpur", 7, 9, "MJ", "Patna",7890));
		railwayStationEntities.add(new RailwayStationEntity(54, "bariarpur", 7, 9, "MJ", "Patna",8970));
		railwayStationEntities.add(new RailwayStationEntity(55, "sultanpur", 7, 9, "MJ", "Patna", 5000));
		railwayStationEntities.add(new RailwayStationEntity(56, "nathnagar", 7, 9, "MJ", "Patna", 5006));
		railwayStationEntities.add(new RailwayStationEntity(57, "patam", 7, 9, "MJ", "Patna",6500));
		railwayStationEntities.add(new RailwayStationEntity(58, "lakhisarai", 7, 9, "MJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(59, "Muger", 7, 9, "MJ", "Patna", 8500));
		railwayStationEntities.add(new RailwayStationEntity(60, "abhaypur", 7, 9, "MJ", "Patna", 6500));
		railwayStationEntities.add(new RailwayStationEntity(61, "kajra", 7, 9, "MJ", "Patna", 5008));
		railwayStationEntities.add(new RailwayStationEntity(62, "danapur", 7, 9, "MJ", "Patna",8500));
		railwayStationEntities.add(new RailwayStationEntity(63, "khagaria", 7, 9, "MJ", "Patna",5500));
		railwayStationEntities.add(new RailwayStationEntity(64, "begusarai", 7, 9, "MJ", "Patna",5500));
		railwayStationEntities.add(new RailwayStationEntity(65, "Barauni", 7, 9, "MJ", "Patna", 5450));
		railwayStationEntities.add(new RailwayStationEntity(66, "shimoga", 7, 9, "MJ", "Patna",789));
		railwayStationEntities.add(new RailwayStationEntity(67, "mangalore", 7, 9, "MJ", "Patna", 8500));
		railwayStationEntities.add(new RailwayStationEntity(68, "Mysore", 7, 9, "MJ", "Patna",7890));
		railwayStationEntities.add(new RailwayStationEntity(69, "tumkur", 7, 9, "MJ", "shimoga", 5000));
		railwayStationEntities.add(new RailwayStationEntity(70, "yashvanpur", 7, 9, "MJ", "akbarnagar", 500));
		railwayStationEntities.add(new RailwayStationEntity(71, "akbarnagar", 7, 9, "MJ", "lakhimpur", 2500));
		railwayStationEntities.add(new RailwayStationEntity(72, "Huballi", 7, 9, "MJ", "yashvatpur", 6500));
		railwayStationEntities.add(new RailwayStationEntity(73, "madurai", 7, 9, "MJ", "kazipat", 4560));
		railwayStationEntities.add(new RailwayStationEntity(74, "kazipat", 7, 9, "MJ", "madurai", 4000));

		RailwayStationDAO dao = new RailwaystationDAOImpl();
		dao.putAll(railwayStationEntities);
	}

}
