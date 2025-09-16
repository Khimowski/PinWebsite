package com.zredtea.dao.impl;

import com.zredtea.dao.UserDao;
import com.zredtea.entity.User;
import com.zredtea.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDaoImpl implements UserDao {
    @Override
    public void newUser(User user) {
        String sql = "INSERT INTO users(id,username,nickname,password,salt) VALUES(?,?,?,?,?)";
        Connection conn = DBUtil.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setLong(1, user.getId());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getNickname());
            pst.setString(4, user.getPassword());
            pst.setString(5, user.getSalt());
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        String sql = "";
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User searchUserById(Long id) {
        return null;
    }
}
