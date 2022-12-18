package com.ecommerce.maskmstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity (name="ord")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private LocalDate createdOn=LocalDate.now();

    private double price;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    List<LineItem> lineItems=new ArrayList<>();

    Boolean orderPaid=false;

    String orderStatus=OrderStatus.Pending.getOrderStatus();
    @ManyToOne
    @JsonIgnore
    private Buyer buyer;

    @Override
    public String toString() {
        return "Your Order : " +
                "\n\tid : " + id +
                "\n\tcreatedOn : " + createdOn +
                "\n\tprice : " + price +
                "\n\t"+ lineItems +
                "\n\torderStatus : '" + orderStatus;
    }
}
