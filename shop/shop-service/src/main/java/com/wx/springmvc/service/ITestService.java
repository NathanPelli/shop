package com.wx.springmvc.service;

import com.wx.springmvc.model.Account;

import java.util.List;

public interface ITestService {
    public void test();

    public boolean transfer(float money, int from, int to) throws Exception;

    public int insertAccount(Account account) throws Exception;

    public Account findAccountById(int i);

    public List<Account> findAccountsById(int i);
}
