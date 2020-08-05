package com.demo.controller;

import com.demo.domain.Account;
import com.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/test")
    public String testPage(Model model) {
        System.out.println("表现层：测试。。。。");
        model.addAttribute("test", "测试成功");
        return "test";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有账户。。。。");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(HttpServletRequest request, HttpServletResponse response, Account account) throws IOException, ServletException {
        System.out.println("表现层：保存所有账户。。。。");
        accountService.save(account);
        request.getRequestDispatcher("/account/findAll").forward(request,response);
//        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}
