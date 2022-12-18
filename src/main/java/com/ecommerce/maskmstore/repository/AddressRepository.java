package com.ecommerce.maskmstore.repository;

import com.ecommerce.maskmstore.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long> {

}
