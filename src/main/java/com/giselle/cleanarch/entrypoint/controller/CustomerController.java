package com.giselle.cleanarch.entrypoint.controller;

import com.giselle.cleanarch.core.usecase.*;
import com.giselle.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.giselle.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.giselle.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUsecase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @Autowired
    private FindAllCustomersUseCase findAllCustomersUseCase;

    @Autowired
    private CustomerMapper customerMapper;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUsecase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> findAll() {
        var customers = findAllCustomersUseCase.findAll();
        var customerResponses = customers.stream()
                .map(customerMapper::toCustomerResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(customerResponses, HttpStatus.OK);
    }
}
