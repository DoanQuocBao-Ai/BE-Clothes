package com.ecommerce.maskmstore.model;
import com.ecommerce.maskmstore.model.stock.Product;
import com.ecommerce.maskmstore.model.stock.ProductApprovedStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long sId;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="User_ID")
    User user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    @JsonIgnore
    List<Product> products;

    private String status= ProductApprovedStatus.PENDING.getProductStatus();

}
