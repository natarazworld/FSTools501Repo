package com.nt.card;

public class CardPayment {
	
	public String paymentUsingCreditCard(long cardno, double amount) {
		return  amount+" amount payment is done using creditCard";
	}
	
	public String paymentUsingDebitCard(long cardno, double amount) {
		return  amount+" amount payment is done using DebitCard";
	}
	

}
