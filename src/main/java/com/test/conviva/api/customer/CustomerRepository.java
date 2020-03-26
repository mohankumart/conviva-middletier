package com.test.conviva.api.customer;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Page<Customer> findAll(Pageable pageable);

}
