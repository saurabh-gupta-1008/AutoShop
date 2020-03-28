package com.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	
	@Autowired
	public CarDao carObj;
	

	private List<Car> carList=new ArrayList<Car>(Arrays.asList(new Car(1,"Maruti Suzuki","Swift"),
			new Car(2,"Maruti Suzuki","Swift Dzire"),
			new Car(3,"Maruti Suzuki","WagonR")));

	public void addDetails(Car car) {
		System.out.println(car.getCarMake());
		carObj.addDetails(car);
	}

	public Car getCarDetails(int i) {
		// TODO Auto-generated method stub
		return carObj.getCarDetails(1);
		
	}
	
}
