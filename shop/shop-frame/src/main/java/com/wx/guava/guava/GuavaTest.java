package com.wx.guava.guava;

import com.wx.guava.guava.GuavaCacheService;
import com.wx.guava.guava.City;

import java.util.concurrent.ExecutionException;

/**
 * Created By 002764
 * on 2018/10/18 11:17
 * 测试guava的LoadingCache的使用
 */
public class GuavaTest {
    public static void main(String[] args){
        GuavaCacheService cacheService = new GuavaCacheService();
        try {
            String str1 = cacheService.getCache().get("111").toString();
            cacheService.getCache().put("111",new City("001","深圳"));
            String str2 = cacheService.getCache().get("111").toString();
            System.out.println(str1);
            System.out.println("===============");
            System.out.println(str2);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
