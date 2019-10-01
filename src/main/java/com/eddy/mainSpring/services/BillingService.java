package com.eddy.mainSpring.services;

import com.eddy.mainSpring.model.Invoice;
import com.eddy.mainSpring.model.Order;

public interface BillingService {
    Invoice createInvoice(Order order);


}
