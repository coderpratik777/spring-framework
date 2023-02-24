package com.pratiti.component;

import java.io.IOException;

import org.springframework.stereotype.Component;

@Component("currConv") //alternative to <bean id="currConv" class="...currencyConverter"/>
public class CurrencyConverter {
	
	public double convert(String from,String to,double amount) {
		
		if(from.equals("USD") && to.equals("INR")) {
			return amount*83.64;
		}
		else if (from.equals("GBP") && to.equals("INR")) {
			return amount*99.95;
		}
		else
			return 0;
	}
	
	
	
	
	
	
}
