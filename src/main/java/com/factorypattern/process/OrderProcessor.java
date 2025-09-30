package com.factorypattern.process;

import com.factorypattern.factory.abstractUtil.RegionFactory;

public class OrderProcessor {

private RegionFactory factory;
  
  public OrderProcessor(RegionFactory factory) {
    this.factory = factory;
  }
  
  public void processOrder() {
    factory.createProduct().describeProduct();
    factory.createInvoice().generateInvoice();
    factory.createPackaging().packProduct();
  }
}
