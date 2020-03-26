package com.test.conviva.api.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(int page) {
        Pageable pageable = PageRequest.of(page-1, 5);

        List<Customer> customers = new ArrayList<>();
        for (Customer customer : customerRepository.findAll(pageable)) {
            customers.add(customer);
        }
        return customers;
    }

    public Long getCount() {
        return  customerRepository.count();
    }

    public Optional<Customer> getCustomer(Long id) {
        return customerRepository.findById(id);
    }
}






