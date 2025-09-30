package com.factorypattern.factory.abstractUtil.impl;

import com.factorypattern.factory.Invoice;
import com.factorypattern.factory.Packaging;
import com.factorypattern.factory.Product;
import com.factorypattern.factory.abstractUtil.RegionFactory;
import com.factorypattern.factory.impl.WesternInvoice;
import com.factorypattern.factory.impl.WesternPackaging;
import com.factorypattern.factory.impl.WesternProduct;

public class WesternRegionFactory implements RegionFactory {

  @Override
  public Product createProduct() {
    return new WesternProduct();
  }

  @Override
  public Packaging createPackaging() {
    return new WesternPackaging();
  }

  @Override
  public Invoice createInvoice() {
    return new WesternInvoice();
  }

}
