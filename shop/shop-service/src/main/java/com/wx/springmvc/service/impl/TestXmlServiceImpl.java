package com.wx.springmvc.service.impl;

import com.wx.springmvc.model.Account;
import com.wx.springmvc.service.ITestXmlService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By 002764
 * on 2018/10/30 20:13
 */
@Service("testXmlService")
public class TestXmlServiceImpl implements ITestXmlService {
    @Override
    public int insertAccount(Account account) throws Exception {
        return 0;
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
