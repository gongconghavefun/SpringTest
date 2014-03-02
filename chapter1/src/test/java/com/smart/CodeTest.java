package com.smart;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.smart.Car.Car;
import com.smart.beanfactory.Beans;

public class CodeTest {
	public static void main(String[] args) {
		/*
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:com/smart/beanfactory/beans.xml");
		BeanFactory xmlBeanFactory = new XmlBeanFactory(res);
		Car car = (Car) xmlBeanFactory.getBean("car", Car.class);
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
		*/
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car = (Car) ctx.getBean("car");
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
	}
}
