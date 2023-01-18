package com.bootcoding.project.model;

import java.awt.*;
import java.sql.Date;

public class Order {
    private int id;
    private String customerName;
    private String rtesturantName;
    private MenuItem[] MenuItems;
    private double totalPrice;
    private Date orderDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRtesturantName() {
        return rtesturantName;
    }

    public void setRtesturantName(String rtesturantName) {
        this.rtesturantName = rtesturantName;
    }

    public MenuItem[] getMenuItems() {
        return MenuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        MenuItems = menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
