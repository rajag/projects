package com.raja.repository;

import java.util.ArrayList;
import java.util.List;

import com.raja.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.raja.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer  = new Customer();
		customer.setFirstname("Raja");
		customer.setLastname("P");
		customers.add(customer);
		return customers;
		
	}
}
