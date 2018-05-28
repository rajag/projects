package com.raja.repository;

import java.util.List;

import com.raja.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}