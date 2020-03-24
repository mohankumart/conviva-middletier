package com.test.conviva.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/{id}")
    public List<AddressDTO> getAddresses(@PathVariable Long id) {
        List<Address> addresses = addressService.getAddresses(id);
        ModelMapper modelMapper = new ModelMapper();
        List<AddressDTO> addressDTOList = new ArrayList<>();
        for (Address address: addresses) {
            addressDTOList.add(modelMapper.map(address, AddressDTO.class));
        }
        return addressDTOList;
    }

    @GetMapping("/list")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
}


