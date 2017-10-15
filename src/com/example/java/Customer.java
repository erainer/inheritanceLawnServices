package com.example.java;

public class Customer {
    public String customerName;
    public String customerPhone;
    public String customerAddress;
    public double squareFootage;
    /**
     * constructor
     */
    public Customer(String name, String phone, String address, double footage) {
        this.customerName = name;
        this.customerPhone = phone;
        this.customerAddress = address;
        this.squareFootage = footage;
    }
    /**
     * gets name
     */
    public String getName() {
        return customerName;
    }
    /**
     * sets name
     */
    public void setName(String name) {
        this.customerName = name;
    }
    /**
     * gets phone
     */
    public String getPhone() {
        return customerPhone;
    }
    /**
     * sets phone
     */
    public void setPhone(String phone) {
        this.customerPhone = phone;
    }
    /**
     * gets address
     */
    public String getAddress() {
        return customerAddress;
    }
    /**
     * sets address
     */
    public void setAddress(String address) {
        this.customerAddress = address;
    }
    /**
     * gets footage
     */
    public Double getFootage() {
        return squareFootage;
    }
    /**
     *sets footage
     */
    public void setFootage(double footage) {
        this.squareFootage = footage;
    }
}
