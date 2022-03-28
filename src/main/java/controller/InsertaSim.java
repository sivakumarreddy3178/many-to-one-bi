package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Mobile;
import dto.Sim;

public class InsertaSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("skr");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Mobile m=new Mobile();
		m.setCost(345566);
		m.setName("nokia");
		Sim s1=new Sim();
		s1.setServiceProvider("jio");
		s1.setType("pre");
		s1.setM(m);
		
	
		
		Sim s2=new Sim();
		s2.setServiceProvider("airtel");
		s2.setType("pre");
		s2.setM(m);
		

	}
	static void m1() {
		System.out.println("we are new ");
	}

}
