package com.demo.test;

import com.demo.dao.IAccountDao;
import com.demo.domain.Account;
import com.demo.service.IAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        //查询所有数据
        List<Account> list = accountDao.findAll();
        list.forEach(System.out::println);
        //关闭资源
        inputStream.close();
        session.close();
    }

    @Test
    public void run2() throws IOException {
        Account account = new Account();
        account.setName("王五");
        account.setMoney(300);

        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        //保存数据
        accountDao.save(account);
        //提交事务
        session.commit();
        //关闭资源
        inputStream.close();
        session.close();
    }
}
