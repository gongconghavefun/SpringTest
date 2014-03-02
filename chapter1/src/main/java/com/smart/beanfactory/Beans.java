package com.smart.beanfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smart.Car.Car;

@Configuration
public class Beans {
	@Bean(name="car")
	public Car buildCar(){
		Car car = new Car();
		car.setBrand("1111");
		car.setColor("红绿色");
		car.setMaxSpeed("300");
		return car;
	}
}
