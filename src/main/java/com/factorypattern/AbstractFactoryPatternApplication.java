package com.factorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.factorypattern.factory.Payment;
import com.factorypattern.factory.abstractUtil.RegionFactory;
import com.factorypattern.factory.abstractUtil.impl.IndianRegionFactory;
import com.factorypattern.factory.abstractUtil.impl.WesternRegionFactory;
import com.factorypattern.factoryUtil.PaymentFactory;
import com.factorypattern.model.PaymentType;

//@SpringBootApplication
public class AbstractFactoryPatternApplication {

  private RegionFactory factory;
  
  public AbstractFactoryPatternApplication(RegionFactory factory) {
    this.factory = factory;
  }
  
  public void processOrder() {
    factory.createProduct().describeProduct();
    factory.createInvoice().generateInvoice();
    factory.createPackaging().packProduct();
  }
  
	public static void main(String[] args) {
//		SpringApplication.run(AbstractFactoryPatternApplication.class, args);
	  
	  System.out.println("Factory Design Pattern for payment:");
	  Payment payment = PaymentFactory.getPaymentMethod(PaymentType.CREDITCARD);
	  payment.pay(25.00);
	  
	  System.out.println("\n AbstractFactory Design Pattern for Product description, invoice generation and packing:");
	  AbstractFactoryPatternApplication indianOrder = new AbstractFactoryPatternApplication(new IndianRegionFactory());
	  indianOrder.processOrder();
	  
	  
	  AbstractFactoryPatternApplication westernOrder = new AbstractFactoryPatternApplication(new WesternRegionFactory());
    westernOrder.processOrder();

	}

}
