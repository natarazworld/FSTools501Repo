package com.nt.payment;

public class UPIPayment {
	
	
	public  String    doPaymentUsingPhonePe(long phoneno, double amount) {
		return amount+"payment is  happening  from the phone number  ::"+phoneno+" using phonepe";
		
	}
	
	public  String    doPaymentUsingGpay(long phoneno, double amount) {
		return amount+"payment is  happening  from the phone number ::"+phoneno +" using gpay";
		
	}
	
	
	


}
