package com.giselle.cleanarch.core.dataprovider;

import com.giselle.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
