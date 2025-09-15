package com.zredtea.utils;

import cn.hutool.crypto.digest.DigestUtil;

public class PWDUtil {
    public static String PasswordGetSHA256(String password, String salt) {
        String PasswordPlusSalt = password + salt;
        return DigestUtil.sha256Hex(PasswordPlusSalt);
    }
}
