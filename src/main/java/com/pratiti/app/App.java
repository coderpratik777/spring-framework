package com.pratiti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.component.Animal;
import com.pratiti.component.Calci;
import com.pratiti.component.CurrencyConverter;
import com.pratiti.component.HelloWorld;
import com.pratiti.component.TextEditor;
import com.pratiti.component.bank.Atm;

public class App {
	
	public static void main(String[] args) {
		
		//Loading Spring
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		// Acessing the object 
//		HelloWorld hw=(HelloWorld)ctx.getBean("hello");
//		System.out.println(hw.sayhello("Pratik"));
		
		Calci cal=(Calci)ctx.getBean("calci");
		System.out.println(cal.add(23, 34));
		System.out.println(cal.sub(30, 20));
		
		CurrencyConverter c=(CurrencyConverter)ctx.getBean("currConv");
		System.out.println(c.convert("USD", "INR", 20));
		
		Animal ani =(Animal)ctx.getBean("currAnimal");
		System.out.println(ani.Monkey());
		
		TextEditor te=(TextEditor)ctx.getBean("txtEditor");
		te.load("abc.text");
		
		Atm atm=(Atm)ctx.getBean("hdfcAtm");
		atm.withdraw(11111, 20000);
		
		
	}

}
