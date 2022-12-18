package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    PhoneRepository phoneRepository;
}
