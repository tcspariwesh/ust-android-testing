package com.demo.abstract1;

public abstract class Store {
	void payByCash() {
		System.out.println("paid by cash");
	}
	public abstract void payByCreditCard();
	public abstract void dispatch();
}
