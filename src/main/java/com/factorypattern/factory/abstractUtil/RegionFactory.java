package com.factorypattern.factory.abstractUtil;

import com.factorypattern.factory.Invoice;
import com.factorypattern.factory.Packaging;
import com.factorypattern.factory.Product;

public interface RegionFactory {
  
  Product createProduct();
  Packaging createPackaging();
  Invoice createInvoice();
  
}
