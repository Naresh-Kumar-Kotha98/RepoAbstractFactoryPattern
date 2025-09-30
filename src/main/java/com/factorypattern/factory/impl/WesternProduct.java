package com.factorypattern.factory.impl;

import com.factorypattern.factory.Product;

public class WesternProduct implements Product {

  @Override
  public void describeProduct() {
    System.out.println("Product with Western specifications and branding..");
  }

}
