package com.iqmsoft.soap;

import com.iqmsoft.soap.dto.PaymentProcessorRequest;
import com.iqmsoft.soap.dto.PaymentProcessorResponse;


public class PaymentProcessorImpl implements PaymentProcessor {

	public PaymentProcessorResponse processPayment(
			PaymentProcessorRequest paymentProcessorRequest) {
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		System.out.println("Simple Test");
		System.out.println("Business Logic Goes Here");
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
