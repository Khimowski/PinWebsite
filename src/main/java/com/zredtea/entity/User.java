package com.zredtea.entity;

public class User {
    private Long id;
    private String username;
    private String nickname;
    private String password;
    private String salt;

    public User() {
    }

    public User(Long id, String username, String nickname,String password, String salt) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.salt = salt;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

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
        System.out.println( "id=" + id + "\n" +
                            "username=" + username + "\n" +
                            "nickname=" + nickname + "\n" +
                            "password=" + password + "\n" +
                            "salt=" + salt
        );
    }

}
