package com.admin.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    /*错误码*/
    private Integer code;

    /*提示信息*/
    private String msg;

    /*返回的具体内容*/
    private T data;

}
