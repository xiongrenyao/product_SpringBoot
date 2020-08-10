package com.xry.product.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Files {
    private Integer id;
    private String fileName;
    private String autoName;
    private String userName;
    private String fileDesc;
    

}
