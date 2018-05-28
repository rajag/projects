package com.raja.service;

import java.util.List;

import com.raja.model.Customer;
import com.raja.repository.CustomerRepository;
import com.raja.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.raja.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
