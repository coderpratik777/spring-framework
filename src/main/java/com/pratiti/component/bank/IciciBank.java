package com.pratiti.component.bank;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {
	
	public boolean canWithDraw(int atmId, int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer of Icici bank wants to withdraw money...");
		return true;
	}
	public boolean isCustomerPresent(int acno) {
		// TODO Auto-generated method stub
		if(acno==2222)
			return true;
		return false;
	}

}
