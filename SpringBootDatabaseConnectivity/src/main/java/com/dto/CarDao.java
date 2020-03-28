package com.dto;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CarDao {

	public void addDetails(Car car) {
	
		
		Session session = HibernateUtil.getSession();
	      Transaction tx = null;
	      Integer carId = null;
	      
	       System.out.println("car details"+car.getCarMake());
	      try {
	         tx = session.beginTransaction();
	         carId = (Integer) session.save(car); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }	
		
	}

	public Car getCarDetails(int i) {
		Session session=HibernateUtil.getSession();
		Transaction tx=null;
		Car carDetails=null;
		try{
			tx=session.beginTransaction();
			carDetails=session.get(Car.class, 1);
			tx.commit();
			return carDetails;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return carDetails;
	}
	
}
