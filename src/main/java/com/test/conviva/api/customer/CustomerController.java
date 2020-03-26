package com.test.conviva.api.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin
    @GetMapping("/list")
    public List<Customer> getAllCustomers(@RequestParam int page) {
        return customerService.getAllCustomers(page);
    }

    @CrossOrigin
    @GetMapping("/count")
    public Long getCount() {
        return customerService.getCount();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }
}









