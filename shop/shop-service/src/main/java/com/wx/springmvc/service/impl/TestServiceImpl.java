package com.wx.springmvc.service.impl;

import com.wx.springmvc.dao.ITestDAO;
import com.wx.springmvc.model.Account;
import com.wx.springmvc.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By 002764
 * on 2018/10/30 20:12
 */
@Service("testService")
public class TestServiceImpl implements ITestService {
    Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Resource
    private ITestDAO testDAO;
    @Override
    public void test() {

    }

    @Override
    public boolean transfer(float money, int from, int to) throws Exception {
        return false;
    }

    @Override
    public int insertAccount(Account account) throws Exception {
        System.out.println("-----开始执行插入操作------");
        return this.testDAO.insertAccount(account);
    }

    @Override
    public Account findAccountById(int i) {
        return null;
    }

    @Override
    public List<Account> findAccountsById(int i) {
        return null;
    }
}
