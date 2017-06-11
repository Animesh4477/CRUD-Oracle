package com.animesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class ClientForSave { 
 
	public static void main(String[] args) throws Exception
	{
 
		try{
		//
		SessionFactory factory =
			    new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//
		Session session = factory.openSession();
		Product p=new Product();
 
		p.setProductId(101);
		p.setProName("iPhone");
		p.setPrice(25000);
 
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		}
		catch(Exception e)
		{
			System.out.println("exception is  :"+e.getMessage());
			e.printStackTrace();
		}
	}
 
}