package com.test.conviva.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddresses(Long id) {
        List<Address> addresses = new ArrayList<>();
        for (Address address : addressRepository.findAllByCustomerId(id)) {
            addresses.add(address);
        }
        return addresses;
    }

    public List<Address> getAllAddresses() {
        List<Address> addresses = new ArrayList<>();
        for (Address address : addressRepository.findAll()) {
            addresses.add(address);
        }
        return addresses;
    }
}



