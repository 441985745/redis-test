package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangshulong
 * @version 1.0.0
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String userName;

    private String password;


}
