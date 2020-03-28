package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Car")
public class Car {
	
	@GeneratedValue
	@Id
	private int carId;
	
	private String carMake;
	private String carModelName;
	
	public Car()
	{
		
	}
	
	public Car(int carId,String carMake,String carModelName)
	{
		this.carId=carId;
		this.carMake=carMake;
		this.carModelName=carModelName;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	
	

}
