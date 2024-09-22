package com.giselle.cleanarch.dataprovider.repository;

import com.giselle.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

    public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
