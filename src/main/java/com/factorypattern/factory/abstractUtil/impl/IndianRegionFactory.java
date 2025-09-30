package com.factorypattern.factory.abstractUtil.impl;

import com.factorypattern.factory.Invoice;
import com.factorypattern.factory.Packaging;
import com.factorypattern.factory.Product;
import com.factorypattern.factory.abstractUtil.RegionFactory;
import com.factorypattern.factory.impl.IndianInvoice;
import com.factorypattern.factory.impl.IndianPackaging;
import com.factorypattern.factory.impl.IndianProduct;

public class IndianRegionFactory implements RegionFactory {

  @Override
  public Product createProduct() {
    return new IndianProduct();
  }

  @Override
  public Packaging createPackaging() {
    return new IndianPackaging();
  }

  @Override
  public Invoice createInvoice() {
    return new IndianInvoice();
  }

}
