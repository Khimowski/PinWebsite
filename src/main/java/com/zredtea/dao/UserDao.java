package com.zredtea.dao;

import com.zredtea.entity.User;

public interface UserDao {
    void newUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User searchUserById(Long id);
}
