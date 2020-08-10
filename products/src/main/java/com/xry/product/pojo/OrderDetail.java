package com.xry.product.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
     private int id;
     private String orderID;
     private Product product;
     private int quantity;
     private Double discount;
	

}
