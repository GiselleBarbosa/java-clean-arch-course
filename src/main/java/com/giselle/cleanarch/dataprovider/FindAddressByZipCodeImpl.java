package com.giselle.cleanarch.dataprovider;

import com.giselle.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.giselle.cleanarch.core.domain.Address;
import com.giselle.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.giselle.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
