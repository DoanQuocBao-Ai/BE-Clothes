package com.ecommerce.maskmstore.repository;

import com.ecommerce.maskmstore.model.stock.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<ProductCategory,Long> {


}
