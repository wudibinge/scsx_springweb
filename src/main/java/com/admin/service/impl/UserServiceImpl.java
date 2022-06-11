package com.admin.service.impl;

import com.admin.dao.UsersDAO;
import com.admin.pojo.User;
import com.admin.service.UserService;
import com.admin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDAO usersDAO;
    @Override
    public Result<User> login(String userName, String password) {
        Result<User>result=new Result<>();
        User user=usersDAO.findUserByName(userName);
        if(user==null){
            result.setCode(602);
            result.setMsg("ERROR");
            result.setData(null);
            return result;
        }
        String pwd=user.getPassword();
        if(pwd.equals(password)){
            result.setCode(600);
            result.setMsg("OK");
            result.setData(user);
            return result;
        }
        result.setData(null);
        result.setCode(601);
        result.setMsg("NO");
        return result;
    }
}
