package com.jpa.gateway.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="ORDERS")
public class Order {
    @Id
    @Column(name="ORDER_ID")
    private Long orderId;
    @Column(name="CUSTOMER_ID")
    private Long customerId;
    @Column(name="DATE_PURCHASED ")
    private LocalDate datePurchased;
    @Enumerated(EnumType.STRING)
    @Column(name="ORDER_STATUS")
    private OrderStatus orderStatus;


    public Order(){}

    public Order(Long orderId, Long customerId, LocalDate datePurchased, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.datePurchased = datePurchased;
        this.orderStatus = orderStatus;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", datePurchased=" + datePurchased +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
