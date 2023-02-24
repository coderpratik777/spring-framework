package com.pratiti.component.bank;

public interface Bank {
	
	boolean isCustomerPresent(int acno);
	boolean canWithDraw(int atmId,int acno,double amount);

}
