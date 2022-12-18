package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.model.Admin;
import com.ecommerce.maskmstore.model.Buyer;
import com.ecommerce.maskmstore.model.Seller;
import com.ecommerce.maskmstore.model.User;
import com.ecommerce.maskmstore.dto.UserRegisterDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    public Optional<User> findUserByUserName(String userName);

    boolean createUser(UserRegisterDTO userRegisterDTO);

    public void addSeller(Seller seller);
    public void addBuyer(Buyer buyer);
    public void addAdmin(Admin admin);

}
