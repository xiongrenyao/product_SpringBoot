package com.xry.product.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
     private int customerID;
     private String customerName;
     private String customerAdd;
     private String customerBir;
     private String customerTel;
     

}
