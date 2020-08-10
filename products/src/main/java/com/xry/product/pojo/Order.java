package com.xry.product.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
     private String orderID;
     private String orderDate;
     private Customer customer;
     private Employee employee;

}
