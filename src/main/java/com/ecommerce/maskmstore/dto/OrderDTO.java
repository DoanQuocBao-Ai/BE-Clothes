package com.ecommerce.maskmstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class OrderDTO {
    private Date createdOn;
    private double price;
    List<LineItemDTO> lineItemsDTO;

}
