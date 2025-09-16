package com.zredtea.service.impl;

import com.zredtea.dao.UserDao;
import com.zredtea.entity.User;
import com.zredtea.service.LoginService;
import com.zredtea.utils.PWDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Repository
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserDao userDao;

    @Override
    public int Authenticate(String username, String password) {
        User user = userDao.searchUserByUsername(username);
        if (user != null) {
            password = PWDUtil.PasswordGetSHA256(password,user.getSalt());
            if (password.equals(user.getPassword())) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }
}
