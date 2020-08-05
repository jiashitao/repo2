package com.demo.test;

import com.demo.domain.Account;
import com.demo.service.IAccountService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountServiceImpl");
        accountService.findAll();
    }
}
