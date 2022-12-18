package com.ecommerce.maskmstore.model;


import com.ecommerce.maskmstore.model.stock.Product;
import com.ecommerce.maskmstore.model.stock.ProductApprovedStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Digits(integer = 1,fraction = 2,message = "Stars Not Valid")
    private double stars;

    @NotEmpty
    @NotBlank
    private String comment;

    @ManyToOne
    private Product product;



    private String status= ProductApprovedStatus.PENDING.getProductStatus();

}
