package com.test.conviva.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @CrossOrigin
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

    @CrossOrigin
    @GetMapping("/list")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
}


