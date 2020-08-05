package com.demo.service;

import com.demo.domain.Account;

import java.util.List;

public interface IAccountService {
    public List<Account> findAll();

    public void save(Account account);
}
