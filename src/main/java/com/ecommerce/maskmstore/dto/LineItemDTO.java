package com.ecommerce.maskmstore.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LineItemDTO {

    private int quantity;
    private double price;

    private long productId;
}
