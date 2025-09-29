package com.factorypattern.factoryUtil;

import com.factorypattern.factory.Payment;
import com.factorypattern.factory.impl.CreditCardPayment;
import com.factorypattern.factory.impl.PayPalPayment;
import com.factorypattern.factory.impl.UpiPayment;
import com.factorypattern.model.PaymentType;

public class PaymentFactory {

  public static Payment getPaymentMethod(PaymentType type) {
    switch (type) {
      case CREDITCARD:
          return new CreditCardPayment();
      case PAYPAL:
          return new PayPalPayment();
      case UPI:
          return new UpiPayment();
      default:
          throw new IllegalArgumentException("Unknown payment method: " + type);
    }

  }
}
