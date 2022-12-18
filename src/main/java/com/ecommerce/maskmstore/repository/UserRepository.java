package com.ecommerce.maskmstore.repository;

import com.ecommerce.maskmstore.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findUserByUsername(String userName);
    public User findUserByEmail(String email);
}
