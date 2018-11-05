package com.wx;

import java.util.function.Function;

/**
 * Created By 002764
 * on 2018/11/2 10:54
 */
public class FunctionDemo {
    static void modifyTheValue(int valueToBeOperated, Function<Integer,Integer> function){
        int value = function.apply(valueToBeOperated);
        System.out.println(value);
    }

    static void changeValue(int age,Function<Integer,String> function){
        String result = function.apply(age);
        System.out.println(result);
    }

    public static void main(String[] args){
        int incr = 20;  int myNumber = 10;

        modifyTheValue(myNumber, val-> val + incr);

        myNumber = 15;  modifyTheValue(myNumber, val-> val * 10);

        modifyTheValue(myNumber, val-> val - 100);

        modifyTheValue(myNumber, val-> "somestring".length() + val - 100);

        int age = 12;

        changeValue(age,aa -> "年龄是："+aa);

    }
}
