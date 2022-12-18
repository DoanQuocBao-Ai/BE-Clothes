package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.repository.BuyerRepository;
import com.ecommerce.maskmstore.repository.OrderRepository;
import com.ecommerce.maskmstore.model.Buyer;
import com.ecommerce.maskmstore.model.LineItem;
import com.ecommerce.maskmstore.model.Order;
import com.ecommerce.maskmstore.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements  OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    BuyerRepository buyerRepository;


    @Override
    public List<LineItem> getOrderLineItemsByOrderId(long id) {
        return orderRepository.findAllLineItemsByOrderId(id);
    }

    @Override
    public Order getOrderById(long id) {
        return orderRepository.findOrderById(id);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order deliveredOrder(String userName, long oId) {

            Buyer buyer =buyerRepository.findBuyerByUsername(userName);
            List<Long> lOID= buyer.getOrders().stream().map(o->o.getId()).collect(Collectors.toList());
            if( lOID.contains(oId)) {
                Order order=orderRepository.findOrderById(oId);
                order.setOrderStatus(OrderStatus.Delivered.getOrderStatus());
                orderRepository.save(order);
                buyerRepository.save(buyer);
                return order;
            }
            return null;

    }
}
