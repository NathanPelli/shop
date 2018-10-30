package com.wx.dubbo.domain;

import java.io.Serializable;

/**
 * Created By 002764
 * on 2018/10/22 16:11
 */
public class HelloWorld implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
