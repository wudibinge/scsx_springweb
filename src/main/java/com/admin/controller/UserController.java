package com.admin.controller;

import com.admin.pojo.User;
import com.admin.service.UserService;
import com.admin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
public class UserController {
    @Autowired
    private UserService users;
    @CrossOrigin
    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User user){

        return users.login(user.getUserName(), user.getPassword());
    }



}
