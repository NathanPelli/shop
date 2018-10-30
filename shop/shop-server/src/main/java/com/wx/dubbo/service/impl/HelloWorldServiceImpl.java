package com.wx.dubbo.service.impl;

import com.wx.dubbo.domain.HelloWorld;
import com.wx.dubbo.service.IHelloWorldService;

/**
 * Created By 002764
 * on 2018/10/22 16:16
 */
public class HelloWorldServiceImpl implements IHelloWorldService {
    @Override
    public HelloWorld sayHelloWorld(HelloWorld helloWorld) {
        helloWorld.setName("Are You OK?");
        return helloWorld;
    }
}
