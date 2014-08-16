package com.springdemo.dao;

import com.springdemo.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by wenpeng.wp on 2014/7/13.
 */
@Repository
public class LoginLogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sqlStr = "INSERT INTO t_login_log( user_id, ip, login_datetime ) "
                + " VALUE( ?,?,? )";
        jdbcTemplate.update(sqlStr, new Object[] {loginLog.getUserId(),
                loginLog.getIp(), loginLog.getLoginDatetime() });
    }

}
