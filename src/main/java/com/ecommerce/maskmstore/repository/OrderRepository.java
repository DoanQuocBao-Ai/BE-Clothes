package com.ecommerce.maskmstore.repository;
import com.ecommerce.maskmstore.model.LineItem;

import com.ecommerce.maskmstore.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order,Long>{
    @Query(value = "select o.lineItems from ord o where o.id=:orderId")
    public List<LineItem> findAllLineItemsByOrderId(long orderId);

    @Query(value = "select b.orders from Buyer b where b.bId=:buyerId")
    public List<Order> findAllOrdersByBuyerId(long buyerId);
    public Order findOrderById(long id);

}
