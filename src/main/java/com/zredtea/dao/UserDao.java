package com.zredtea.dao;

import com.zredtea.entity.User;

public interface UserDao {
    void newUser(User user);
    void updateUser(User user);
    void deleteUser(Long userid);
    User searchUserByUserid(Long userid);
}
