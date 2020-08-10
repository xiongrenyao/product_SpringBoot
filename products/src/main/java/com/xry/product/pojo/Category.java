package com.xry.product.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	private Integer categoryID;
	private String categoryName;
	private String categoryDesc;

}
