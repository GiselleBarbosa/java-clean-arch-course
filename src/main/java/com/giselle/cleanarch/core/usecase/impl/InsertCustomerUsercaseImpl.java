package com.giselle.cleanarch.core.usecase.impl;

import com.giselle.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.giselle.cleanarch.core.dataprovider.InsertCustomer;
import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUsercaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private InsertCustomer insertCustomer;

    public InsertCustomerUsercaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
