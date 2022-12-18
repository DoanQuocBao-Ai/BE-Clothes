package com.ecommerce.maskmstore.repository;

import com.ecommerce.maskmstore.model.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends CrudRepository<Phone,Long> {
}
