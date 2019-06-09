package com.zpark.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer deptId;

    private String deptName;

    private String deptLoc;

    
}