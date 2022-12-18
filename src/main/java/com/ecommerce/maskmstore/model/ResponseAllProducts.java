package com.ecommerce.maskmstore.model;

import com.ecommerce.maskmstore.model.stock.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseAllProducts extends Response{

    private List<Product> products;
}
