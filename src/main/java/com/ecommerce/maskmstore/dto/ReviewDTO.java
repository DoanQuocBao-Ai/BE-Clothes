package com.ecommerce.maskmstore.dto;

import com.ecommerce.maskmstore.model.stock.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReviewDTO {

    private double stars;
    private String comment;
    private Product product;
    private String status;
}
