package com.admin.service;

import com.admin.pojo.User;
import com.admin.util.Result;

public interface UserService {

    public Result<User> login(String userName, String password);
}
