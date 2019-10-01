package com.eddy.mainSpring.services;

import com.eddy.mainSpring.model.Customer;

public interface UserService {
    Customer getCustomer(int id);
    Customer getCustomer(Customer customer);
    Customer getCustomerByLogin(String login);
}
