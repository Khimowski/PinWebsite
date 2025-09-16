package com.zredtea.entity;

import java.util.UUID;

public class User {
    private Long userid;
    private String username;
    private String nickname;
    private String password;
    private String salt;

    public User() {
        this.salt = UUID.randomUUID().toString();
    }

    public User(Long userid, String username, String nickname,String password) {
        this.userid = userid;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.salt = UUID.randomUUID().toString();
    }

    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {this.userid = userid;}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return ( "userid=" + userid + "\n" +
                            "username=" + username + "\n" +
                            "nickname=" + nickname + "\n" +
                            "password=" + password + "\n" +
                            "salt=" + salt + "\n"
        );
    }

}
