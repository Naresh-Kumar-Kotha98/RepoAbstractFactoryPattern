package com.factorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.factorypattern.factory.Payment;
import com.factorypattern.factory.abstractUtil.RegionFactory;
import com.factorypattern.factory.abstractUtil.impl.IndianRegionFactory;
import com.factorypattern.factory.abstractUtil.impl.WesternRegionFactory;
import com.factorypattern.model.PaymentType;
import com.factorypattern.process.OrderProcessor;
import com.factorypattern.process.PaymentFactory;

//@SpringBootApplication
public class AbstractFactoryPatternApplication {
  
	public static void main(String[] args) {
	  
//		SpringApplication.run(AbstractFactoryPatternApplication.class, args);
	  
	  System.out.println("Factory Design Pattern for payment:");
	  Payment payment = PaymentFactory.getPaymentMethod(PaymentType.CREDITCARD);
	  payment.pay(25.00);
	  
	  System.out.println("\n AbstractFactory Design Pattern for Product description, invoice generation and packing:");
	  OrderProcessor indianOrder = new OrderProcessor(new IndianRegionFactory());
	  indianOrder.processOrder();
	  
	  OrderProcessor westernOrder = new OrderProcessor(new WesternRegionFactory());
    westernOrder.processOrder();

	}

}
