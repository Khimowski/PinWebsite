package com.zredtea.service;

import com.zredtea.entity.User;

public interface LoginService {
    public void newUser(User user);
    public void updateUser(User user);
    public void deleteUserByUserid(Long userid);
    public User getUserByUsername(String username);
    public User getUserByUserid(Long userid);

    public int Authenticate(String username, String password);
}
