package com.zredtea.service.impl;

import com.zredtea.service.LoginService;
import com.zredtea.utils.PWDUtil;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String Authenticate(String username, String password) {
        String salt = null;
        password = PWDUtil.PasswordGetSHA256(password,salt);

    }
}
