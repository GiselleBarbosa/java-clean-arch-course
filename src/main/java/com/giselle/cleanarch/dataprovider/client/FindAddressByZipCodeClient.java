package com.giselle.cleanarch.dataprovider.client;

import com.giselle.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${giselle.client.address.url}"
)
public interface FindAddressByZipCodeClient {
    @GetMapping(value = "/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}