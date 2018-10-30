package com.wx.guava.guava;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created By 002764
 * on 2018/10/18 11:09
 */
@Setter
@Getter
@ToString
public class City {
    private String name;
    private String code;

    public City(String code,String name){
        this.code = code;
        this.name = name;
    }
    @Override
    public String toString(){
        return code+":"+name;
    }
}
