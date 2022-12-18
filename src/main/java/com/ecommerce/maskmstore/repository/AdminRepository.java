package com.ecommerce.maskmstore.repository;

import com.ecommerce.maskmstore.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin,Long> {

    @Query(value = "select admin from Admin admin where admin.user.username=:admin_userName")
    public Admin findAdminByUserName(String admin_userName);
}
