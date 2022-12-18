package com.ecommerce.maskmstore.model.stock;

import com.ecommerce.maskmstore.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Stock {

    @Id
    @GeneratedValue
    long id;

    @OneToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SELLER_ID")
    private Seller seller;

    @Digits(integer = 5,fraction = 0)
    private int quantity;
}
