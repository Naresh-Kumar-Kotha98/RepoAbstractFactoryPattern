package com.factorypattern.factory.impl;

import com.factorypattern.factory.Packaging;

public class WesternPackaging implements Packaging {

  @Override
  public void pack() {
    System.out.println("Packed in sleek Western packaging.");
  }


}
