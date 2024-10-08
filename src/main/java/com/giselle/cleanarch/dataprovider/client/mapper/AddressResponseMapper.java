package com.giselle.cleanarch.dataprovider.client.mapper;

import com.giselle.cleanarch.core.domain.Address;
import com.giselle.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
