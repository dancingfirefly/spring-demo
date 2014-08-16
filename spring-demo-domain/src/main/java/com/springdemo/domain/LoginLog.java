package com.springdemo.domain;

import java.util.Date;

/**
 * Created by wenpeng.wp on 2014/7/13.
 */
public class LoginLog {

    /** 登录log id */
    private int loginLogId;
    /** 登录的用户 id */
    private int userId;
    /** 登录 ip */
    private String ip;
    /** 记录该条登录日志的时间 */
    private Date loginDatetime;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }
}
