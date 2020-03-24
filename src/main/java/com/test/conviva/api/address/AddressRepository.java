package com.test.conviva.api.address;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
    Iterable<Address> findAllByCustomerId(Long id);
}
