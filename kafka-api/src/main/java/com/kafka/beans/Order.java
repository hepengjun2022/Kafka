package com.kafka.beans;

public class Order {
    private Integer id;
    private Integer orderId;
    private Integer num;
    private double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Order(Integer id, Integer orderId, Integer num, double money) {
        this.id = id;
        this.orderId = orderId;
        this.num = num;
        this.money = money;
    }
}
