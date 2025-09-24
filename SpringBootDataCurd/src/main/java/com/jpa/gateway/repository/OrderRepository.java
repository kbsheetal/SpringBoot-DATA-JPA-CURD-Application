package com.jpa.gateway.repository;

import com.jpa.gateway.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Long> {


    List<Order> findByCustomerId(Long customerId);

    @Query(value="SELECT  o.orderId,o.orderStatus from Order o")
    List<Object[]> findOrderIdAndStatus();

    @Query(value="select * from orders where order_Status= ?" , nativeQuery=true)
    List<Order> fetchOrderByStatus(String status);

}

