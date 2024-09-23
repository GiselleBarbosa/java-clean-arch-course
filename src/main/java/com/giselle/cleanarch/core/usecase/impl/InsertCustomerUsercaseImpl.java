package com.giselle.cleanarch.core.usecase.impl;

import com.giselle.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.giselle.cleanarch.core.dataprovider.InsertCustomer;
import com.giselle.cleanarch.core.dataprovider.SendCpfForValidation;
import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUsercaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUsercaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer,
            SendCpfForValidation sendCpfForValidation) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }
}
