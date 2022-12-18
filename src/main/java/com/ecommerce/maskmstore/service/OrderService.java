package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.model.LineItem;
import com.ecommerce.maskmstore.model.Order;

import java.util.List;

public interface OrderService {
    public List<LineItem> getOrderLineItemsByOrderId(long id);
    public Order getOrderById(long id);

    public void save(Order order);
    public Order deliveredOrder(String userName,long oId);
}
