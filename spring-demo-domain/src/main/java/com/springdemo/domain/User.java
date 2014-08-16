package com.springdemo.domain;

import java.util.Date;

/**
 * Created by wenpeng.wp on 2014/7/13.
 */
public class User {

    /** 用户id */
    private int userId;
    /** 用户name */
    private String userName;
    /** 用户密码 */
    private String password;
    /** 最后一次登录的ip */
    private String lastIp;
    /** 最后一次登录时间 */
    private Date lastVisit;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }
}
