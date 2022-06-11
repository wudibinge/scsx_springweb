package com.admin;

import com.admin.dao.UsersDAO;
import com.admin.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WuliuwebApplicationTests {
    @Autowired
    private UsersDAO uersdao;
    @Test
    void contextLoads() {
        System.out.println(uersdao.findUserByName("hsb"));
    }

}
