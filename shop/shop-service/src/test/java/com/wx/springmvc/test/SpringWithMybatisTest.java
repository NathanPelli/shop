package com.wx.springmvc.test;

import com.wx.springmvc.model.Account;
import com.wx.springmvc.service.ITestService;
import com.wx.springmvc.service.ITestXmlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created By 002764
 * on 2018/10/30 20:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SpringWithMybatisTest {
    @Resource
    private ITestService testService;
    @Resource
    private ITestXmlService testXmlService;
    @Test
    public void testInsert(){
        //测试插入数据库
        Account account = new Account();
        account.setMoney(1000);
        account.setName("kael");
        try {
            int id = testService.insertAccount(account);
            System.out.println("==============================="+id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
