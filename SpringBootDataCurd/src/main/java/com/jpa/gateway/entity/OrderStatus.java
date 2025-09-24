package com.jpa.gateway.entity;

public enum OrderStatus {

    ORDERED("ordered"),
    PROCESSED("processed"),
    CANCELLED("cancelled"),
    DELIVERED("delivered"),
    REFUNDED("refunded");


    private String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
