package com.demo.interface1;

import com.demo.abstract1.Store;

public class DigitalStore extends Store{ //concrete class

	@Override
	public void payByCreditCard() {
		System.out.println(
				"Paid by Credit card");
	}
	
//	@Override  //annotation   
	public void payByCash() {
		System.out.println("paid to digital store");
	}

	@Override
	public void dispatch() {
		// TODO Auto-generated method stub
		
	}
	
}
