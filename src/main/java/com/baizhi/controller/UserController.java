package com.baizhi.controller;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/select")
    public String select(ModelMap modelMap){
        List<User> list = userDao.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
        modelMap.addAttribute("list",list);
        return "index";
    }
}
