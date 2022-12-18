package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review,Long> {
}
