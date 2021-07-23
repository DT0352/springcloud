package com.fuvidy.spring_cloud_demo_common.modle;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private Integer age;

}
