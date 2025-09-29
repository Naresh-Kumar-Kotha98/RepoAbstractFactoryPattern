package com.factorypattern.factory.impl;

import com.factorypattern.factory.Packaging;

public class IndianPackaging implements Packaging {

  @Override
  public void pack() {
    System.out.println("Packed in eco-friendly Indian packaging.");
  }


}
