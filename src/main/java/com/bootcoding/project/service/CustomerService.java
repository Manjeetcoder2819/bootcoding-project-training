package com.bootcoding.project.service;

import com.bootcoding.project.model.Customer;
import com.bootcoding.project.utils.*;

public class CustomerService {
    public Customer createCustomer() {


    Customer customer = new Customer();
        customer.setName(CustomerNameGenerator.getName());
        customer.setCity(CityGenerator.getName());
        customer.setEmailId(EmailIdGenerator.getEmailId(customer.getName()));
        customer.setDeliveryAddress(AddressGenerator.getAddress());
        customer.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
//        customer.setQuantity(QuantityGenerator.getQuantity);
        return customer;


    }
    public void print(Customer customer){
        System.out.println("Customer Name:"+customer.getName());
        System.out.println("Customer City:"+customer.getCity());
        System.out.println("Customer EamilId:"+customer.getEmailId());
        System.out.println("Customer Adress:"+customer.getDeliveryAddress());
        System.out.println("Customer PhoneNumber:"+customer.getPhoneNumber());
    }
    public static void main(String[]args){
        CustomerService cs=new CustomerService();
        Customer customer=cs.createCustomer();
        cs.print(customer);
    }
}