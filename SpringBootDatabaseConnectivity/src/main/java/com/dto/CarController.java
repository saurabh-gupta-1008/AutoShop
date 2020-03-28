package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

	@Autowired	
	private CarService carService;
	
	@RequestMapping(method=RequestMethod.POST, value="/addDetails")
	public void addTopic(@RequestBody Car car)
	{
		try{
		System.out.println("inside controller"+car.getCarMake());
		carService.addDetails(car);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/get")
	public ResponseEntity<Car> getCarDetails()
	{
		return new ResponseEntity<Car>(carService.getCarDetails(1),HttpStatus.OK);
	}
}
