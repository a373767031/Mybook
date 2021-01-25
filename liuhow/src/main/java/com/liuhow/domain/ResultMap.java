package com.liuhow.domain;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author liuhao
 * @create 2021-01-25
 */
public class ResultMap extends HashMap<String,Object> {

    private String code;
    private Object data;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
