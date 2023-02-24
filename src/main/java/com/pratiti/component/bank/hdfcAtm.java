package com.pratiti.component.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class hdfcAtm implements Atm {
	
	@Autowired
	private List<Bank> banks;
	
	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		Bank currentBank=null;
		for(Bank bank:banks) {
			if(bank.isCustomerPresent(acno)) {
				currentBank=bank;
				break;
			}
		}
		System.out.println("Customer at hdfc bank wants to withdraw money");
		currentBank.canWithDraw(1111, acno, amount);
		
	}

}
