package com.xworkz.nursery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.nursery.dao.NurseryDAO;
import com.xworkz.nursery.dao.NurseryDAOImpl;
import com.xworkz.nursery.entity.NurseryEntity;

public class NurseryScanner {

	public static void main(String[] args) {
		List<NurseryEntity> nurseryEntities=new ArrayList<NurseryEntity>();
		nurseryEntities.add(new NurseryEntity("Adwik kumar",2,"Triveni","ram@gmail.com","jmp","Ram lakhan",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Bhavana s",3,"veni","lakhan@gmail.com","Bhagalpur","lakhan singh",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Anusha prakash",4,"Triveni","singh@gmail.com","Rampur","Ram singh",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Jinitha kumari",5,"Triveni","arvind@gmail.com","Nathnagar","Avind",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Parinita singh",3,"Triveni","mohan@gmail.com","jmp","Mohan singh",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Sushmitha roy",2,"Triveni","piyush@gmail.com","Akwarnagar","Piyush",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Raksha singh",3,"Triveni","sumit@gmail.com","jmp","sumit tiwari",LocalDateTime.now()));
		nurseryEntities.add(new NurseryEntity("Adwik",4,"Triveni","gupta@gmail.com","jmp","sujit gupta",LocalDateTime.now()));
		NurseryDAO dao=new NurseryDAOImpl();
		dao.saveAll(nurseryEntities);

	}

}
