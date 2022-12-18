package com.ecommerce.maskmstore.service.admin;

import com.ecommerce.maskmstore.repository.AdminRepository;
import com.ecommerce.maskmstore.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin getAdminProfile(String admin_userName) {
        return adminRepository.findAdminByUserName(admin_userName);
    }
}
