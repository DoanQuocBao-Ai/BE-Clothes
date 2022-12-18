package com.ecommerce.maskmstore.model;

import com.ecommerce.maskmstore.model.stock.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseOneProduct extends Response{

    private Product product;
}
