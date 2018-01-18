package com.example.demo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/21 下午3:35.
 * @blog http://blog.didispace.com
 */
@Data
public class User implements Serializable{

    private Integer id;

    private String userName;

    private String password;


}
