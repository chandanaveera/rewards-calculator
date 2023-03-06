package com.rewards.calculator.repository;

import org.springframework.data.repository.CrudRepository;

import com.rewards.calculator.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}
