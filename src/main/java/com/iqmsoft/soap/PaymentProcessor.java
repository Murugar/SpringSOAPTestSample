package com.iqmsoft.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.iqmsoft.soap.dto.PaymentProcessorRequest;
import com.iqmsoft.soap.dto.PaymentProcessorResponse;

@WebService(serviceName = "PaymentProcessor")
public interface PaymentProcessor {

	public @WebResult(name = "response")
	PaymentProcessorResponse processPayment(
			@WebParam(name = "PaymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
