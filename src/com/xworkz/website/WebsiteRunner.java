package com.xworkz.website;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteRunner {

	public static void main(String[] args) throws Exception{
		//WebsiteEntity entity1=new WebsiteEntity("Flipkart","Facebook.com",2003,"Mark Zuckerberg",".com");
		//WebsiteEntity entity2=new WebsiteEntity("whatsApp","Facebook.com",2002," Meta-Mark Zuckerberg",".com");
		//WebsiteEntity entity3=new WebsiteEntity("Amazon","Facebook.com",1997,"Mark Zuckerberg",".com");
		//WebsiteEntity entity4=new WebsiteEntity("Ajio","Facebook.com",2005,"Mukesh Ambani",".com");
		//WebsiteEntity entity5=new WebsiteEntity("Google","Facebook.com",1997,"Mark Zuckerberg",".com");
		//WebsiteEntity entity6=new WebsiteEntity("Yahoo","Facebook.com",2000,"Mark Zuckerberg",".com");
		//WebsiteEntity entity7=new WebsiteEntity("Myntra","Facebook.com",2003,"Mark Zuckerberg",".com");
		//WebsiteEntity entity8=new WebsiteEntity("Nyka","Facebook.com",2003,"Mark Zuckerberg",".com");
		//WebsiteEntity entity9=new WebsiteEntity("TataCliq","Facebook.com",2009,"Ratan Tata",".com");
		//WebsiteEntity entity10=new WebsiteEntity("Hdfc","Facebook.com",2008,"Mark Zuckerberg",".com");
		//WebsiteEntity entity11=new WebsiteEntity("kotak","Facebook.com",2005,"Mark Zuckerberg",".com");
		//WebsiteEntity entity12=new WebsiteEntity("vtu","Facebook.com",2003,"Mark Zuckerberg",".com");
		//WebsiteEntity entity13=new WebsiteEntity("Hsbc","Facebook.com",2002,"Mark Zuckerberg",".com");
		//WebsiteEntity entity14=new WebsiteEntity("tiktok","Facebook.com",2001,"Parag Agarwal",".com");
		//WebsiteEntity entity15=new WebsiteEntity("wikipedia","Facebook.com",2008,"Mark Zuckerberg",".org");
		//WebsiteEntity entity16=new WebsiteEntity("Live","Livenow.com",2002,"Mahesh motewar",".com");
		//WebsiteEntity entity17=new WebsiteEntity("ok","ok.gov.in",2003,"joginder singh dalal",".in");
		//WebsiteEntity entity18=new WebsiteEntity("Flipkart","Facebook.com",2002,"Mark Zuckerberg",".com");
		//WebsiteEntity entity19=new WebsiteEntity("BBC","bbc.com",2003,"john reith",".com");
		//WebsiteEntity entity20=new WebsiteEntity("twitter","bbc.com",2010,"Mark Zuckerberg",".com");
		//List<WebsiteEntity> websiteEntity=new ArrayList<WebsiteEntity>();
		//websiteEntity.add(entity1);
		//websiteEntity.add(entity2);
		//websiteEntity.add(entity3);
		//websiteEntity.add(entity4);
		//websiteEntity.add(entity5);
		//websiteEntity.add(entity6);
		//websiteEntity.add(entity7);
		//websiteEntity.add(entity8);
		//websiteEntity.add(entity9);
		//websiteEntity.add(entity10);
		//websiteEntity.add(entity11);
		//websiteEntity.add(entity12);
		//websiteEntity.add(entity13);
		//websiteEntity.add(entity14);
		//websiteEntity.add(entity15);
		//websiteEntity.add(entity16);
		//websiteEntity.add(entity17);
		//websiteEntity.add(entity18);
		//websiteEntity.add(entity19);
		//websiteEntity.add(entity20);
		//WebsiteDAO dao=new WebsiteDAOImpl();
		//dao.putAll(websiteEntity);
		WebsiteDAO dao1=new WebsiteDAOImpl();
		WebsiteEntity en=dao1.getByNameGoogle();
		System.out.println(en);
		
		
	
		

	}

}
