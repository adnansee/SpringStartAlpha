package com.eddy.mainSpring.services.repository;

import com.eddy.mainSpring.model.BeanType;
import com.eddy.mainSpring.model.Order;
import com.eddy.mainSpring.repository.WareHouseRepositories;

public class WareHoseRepImpl implements WareHouseRepositories {

    // TODO: Just a stub Class
    @Override
    public int getBeanCountByType(BeanType type) {
        return 0;
    }

    @Override
    public void updateStagingArea(BeanType type, int quantity) {

    }

    @Override
    public boolean takeBeansFromStock(BeanType type, int quantity) {
        return false;
    }

    @Override
    public void removeOrderFromStagingArea(Order order) {

    }
}
