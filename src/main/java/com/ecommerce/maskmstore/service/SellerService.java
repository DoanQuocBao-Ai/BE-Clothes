package com.ecommerce.maskmstore.service;

import com.ecommerce.maskmstore.model.Order;
import com.ecommerce.maskmstore.model.Seller;

import java.util.List;


public interface SellerService {
    public Seller getSellerBySId(long id);
    public Seller getSellerByUserName(String userName);
    public List<Long> getOrderIdsBySellerBySId(long sId);

    public Seller makeItApprovedOrRejected(String userName, String status);
    public List<Order> getOrdersBySellerBySId( long sId);

    public List<Seller> getAllSellers();

    public void addSeller(Seller seller);

    public void save(Seller seller);

    public Order shipSellerOrder(String userName, long oId);

    public Order cancelSellerOrder(String userName, long oId);

    public Order getOrderByIdForSeller(String userName, long oId);
}
