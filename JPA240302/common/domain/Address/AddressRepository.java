package com.javaroast.jvx440.engman.common.domain.Address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("adressRepository")
public interface AddressRepository extends CrudRepository<Address, String> {

}
