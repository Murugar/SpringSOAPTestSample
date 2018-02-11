package com.iqmsoft.client;

import java.util.Date;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.iqmsoft.soap.PaymentProcessor;
import com.iqmsoft.soap.dto.CreditCardInfo;
import com.iqmsoft.soap.dto.PaymentProcessorRequest;
import com.iqmsoft.soap.dto.PaymentProcessorResponse;


public class TestClient {
	public static void main(String[] args) {
		cl1();
		
	}

	
	public static void cl1() {
		try {
		
			String address = "http://localhost:8080/SpringSOAPTestSample/services/paymentProcessor?wsdl";
			
			JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
			
			jaxWsProxyFactoryBean.setAddress(address);
		
			jaxWsProxyFactoryBean.setServiceClass(PaymentProcessor.class);
			
			PaymentProcessor cs = (PaymentProcessor) jaxWsProxyFactoryBean.create();
			
			PaymentProcessorRequest p = new PaymentProcessorRequest();
			
			CreditCardInfo c = new CreditCardInfo();
			
			c.setAddress("Test Street");
			c.setCardNumber("99999999999999999999");
			c.setSecCode("777");
			c.setExpirtyDate(new Date());
			
			p.setCreditCardInfo(c);
			p.setAmount(300.00);
			
			
			PaymentProcessorResponse result = cs.processPayment(p);
			
			if(result.isResult()){
		       System.out.println("Result :" + result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
