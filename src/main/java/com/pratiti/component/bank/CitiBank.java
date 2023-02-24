package com.pratiti.component.bank;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank{
	public boolean canWithDraw(int atmId, int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer wants to withdraw money from citibank....");
		return true;
	}
	
	public boolean isCustomerPresent(int acno) {
		// TODO Auto-generated method stub
		if(acno==11111)
			return true;
		return false;
	}
}
