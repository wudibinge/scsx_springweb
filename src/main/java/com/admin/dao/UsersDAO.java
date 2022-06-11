package com.admin.dao;

import com.admin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UsersDAO {
    public User findUserByName(@Param("userName")String userName);

}
