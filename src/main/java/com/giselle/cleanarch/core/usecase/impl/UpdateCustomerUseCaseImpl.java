package com.giselle.cleanarch.core.usecase.impl;

import com.giselle.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.giselle.cleanarch.core.dataprovider.UpdateCustomer;
import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.giselle.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.giselle.cleanarch.dataprovider.FindAddressByZipCodeImpl;

import java.util.Optional;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer
    ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String ZipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(ZipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
