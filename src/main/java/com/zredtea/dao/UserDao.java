package com.zredtea.dao;

import com.zredtea.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    void newUser(User user);
    void updateUser(User user);
    void deleteUserByUserid(Long userid);
    User searchUserByUserid(Long userid);
    User searchUserByUsername(String username);
}