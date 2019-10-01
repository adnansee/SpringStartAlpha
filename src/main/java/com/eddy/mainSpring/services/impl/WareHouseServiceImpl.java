package com.eddy.mainSpring.services.impl;

import com.eddy.mainSpring.model.BeanType;
import com.eddy.mainSpring.model.Order;
import com.eddy.mainSpring.services.WareHouseService;
import com.eddy.mainSpring.repository.WareHouseRepositories;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("prototype")
@Lazy
public class WareHouseServiceImpl implements WareHouseService {
    private WareHouseRepositories wareHouseRepositories;
    public WareHouseServiceImpl(WareHouseRepositories repositories){
        this.wareHouseRepositories = repositories;
    }

    @Override
    public int checkStock(BeanType type) {
        /** SELECT COUNT(*) FROM BEANS_TABLE WHERE type = type.id*/
        return wareHouseRepositories.getBeanCountByType(type);
    }

    @Override
    public boolean reserveBeans(BeanType type, int quantity) {
        boolean reservationSuccess = wareHouseRepositories.takeBeansFromStock(type, quantity);
        moveBeansToStagingAres(type, quantity);
        return false;
    }

    private void moveBeansToStagingAres(BeanType type, int quantity) {
        wareHouseRepositories.updateStagingArea(type, quantity);
        createTicketForPerson(type, quantity);

    }

    private void createTicketForPerson(BeanType type, int quantity) {
        //SEND STUFF TO PRINTER
    }

    @Override
    public void checkOutOrder(Order order) {
        wareHouseRepositories.removeOrderFromStagingArea(order);


    }
}
