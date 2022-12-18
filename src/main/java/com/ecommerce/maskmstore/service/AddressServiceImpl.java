package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepository addressRepository;
}

