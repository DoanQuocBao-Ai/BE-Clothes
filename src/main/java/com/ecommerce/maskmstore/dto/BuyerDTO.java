package com.ecommerce.maskmstore.dto;

import com.ecommerce.maskmstore.model.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class BuyerDTO {

    long points;
    List<Order> orders;
    User user;
    Address shippingAddress;
    Address billingAddress;
    List<PaymentMethod> paymentMethods;
    List<Seller> sellersFollowed;


}
