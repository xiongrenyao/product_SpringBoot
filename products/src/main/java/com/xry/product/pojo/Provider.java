package com.xry.product.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "providers")
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "providerID")
	private Integer providerId;
	@Column(name = "provider_name")
	private String  providerName;
	@Column(name = "provider_add")
	private String  providerAdd;
	@Column(name = "provider_tel")
	private String  providerTel;
	@Column
	private String  account;
	@Column
	private String  email;
	

}
