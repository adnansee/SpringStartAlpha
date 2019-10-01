package com.eddy.mainSpring.services;

import com.eddy.mainSpring.model.BeanType;
import com.eddy.mainSpring.model.Order;

public interface WareHouseService {

    int checkStock(BeanType type);

    boolean reserveBeans(BeanType type, int quantity);

    void checkOutOrder(Order order);

}
