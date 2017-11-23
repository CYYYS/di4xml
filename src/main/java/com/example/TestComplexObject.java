package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.ComplexObject;

public class TestComplexObject {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ComplexObject bean = (ComplexObject) context.getBean("ComplexObject");
		System.out.println(bean);
	}
}
