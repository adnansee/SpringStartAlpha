package com.eddy.mainSpring.repository;

import com.eddy.mainSpring.model.BeanType;
import com.eddy.mainSpring.model.Order;

public interface WareHouseRepositories {
    int getBeanCountByType(BeanType type);

    void updateStagingArea(BeanType type, int quantity);

    boolean takeBeansFromStock(BeanType type, int quantity);

    void removeOrderFromStagingArea(Order order);
}
