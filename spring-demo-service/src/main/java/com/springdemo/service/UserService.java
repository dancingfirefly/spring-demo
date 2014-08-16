package com.springdemo.service;

import com.springdemo.dao.LoginLogDao;
import com.springdemo.dao.UserDao;
import com.springdemo.domain.LoginLog;
import com.springdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * Created by wenpeng.wp on 2014/7/13.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(String userName, String password){
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    public User findUserByUserName(String userName){
        return userDao.findUserByUserName(userName);
    }

    public void loginSuccess(User user){
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDatetime(user.getLastVisit());

        loginLogDao.insertLoginLog(loginLog);
    }
}
