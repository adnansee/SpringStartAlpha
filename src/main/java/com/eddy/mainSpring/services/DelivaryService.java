package com.eddy.mainSpring.services;

import com.eddy.mainSpring.model.Order;

import java.time.LocalDate;

public interface DelivaryService {
    void startDelivery(Order order);

    void planDelivery(Order order, LocalDate date);


}
