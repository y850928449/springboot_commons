package com.baizhi;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonsApplicationTests {
    @Autowired
    UserDao userDao;
    @Test
    public void insert() {
        User user=new User();
        user.setName("12306");
        user.setAge(18);
        userDao.insert(user);
    }
    @Test
    public void selectAll() {
        List<User> list = userDao.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void select() {
        User user=new User();
        user.setAge(18);
        List<User> list = userDao.select(user);
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
    @Test
    public void update() {
        User user=new User();
        user.setId(1);
        user.setName("113");
        userDao.updateByPrimaryKeySelective(user);
    }
}
