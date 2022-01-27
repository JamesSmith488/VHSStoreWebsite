package com.sparta.vhsstorewebsite.services;

import com.sparta.vhsstorewebsite.entities.CustomerEntity;

public class CustomerService {
    
    public void update(CustomerEntity updatedCustomer, CustomerEntity customer) {
        customer.setStoreId(updatedCustomer.getStoreId());
        customer.setFirstName(updatedCustomer.getFirstName());
        customer.setLastName(updatedCustomer.getLastName());
        customer.setEmail(updatedCustomer.getEmail());
        customer.setAddressId(updatedCustomer.getAddressId());
        customer.setActive(updatedCustomer.getActive());
        customer.setCreateDate(updatedCustomer.getCreateDate());
        customer.setLastUpdate(updatedCustomer.getLastUpdate());
    }
}
