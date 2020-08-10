package com.xry.product.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "products")
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Integer productId;
	@Column(name = "product_name")
	private String  productName;
	@Column(name = "income_price")
	private Double  incomePrice;
	private Provider provider;
	@Column
	private Integer quantity;
	@Column(name = "sales_price")
	private Double  salesPrice;
	private Category category;
	@Column(name = "income_time")
	private String  incomeTime;
	@Transient
	@Column(name = "provider_name")
	private String  providerName;
	@Transient
	@Column(name = "category_name")
	private String  categoryName;
	

}
