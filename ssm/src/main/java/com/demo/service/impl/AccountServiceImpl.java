package com.demo.service.impl;

import com.demo.dao.IAccountDao;
import com.demo.domain.Account;
import com.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.err.println("业务层：查询所有账户");
        List<Account> accountList = accountDao.findAll();
        accountList.forEach(System.out::println);
        return accountList;
    }

    @Override
    public void save(Account account) {
        System.err.println("业务层：保存账户");
        accountDao.save(account);
    }
}
