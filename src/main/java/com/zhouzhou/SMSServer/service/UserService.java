package com.zhouzhou.SMSServer.service;

import com.zhouzhou.SMSServer.pojo.User;

import java.util.List;

/**
 * @author 周万宁
 * @className UserService
 * @create 2023/4/4-22:45
 * @description 用户服务
 */
public interface UserService {
    /**
     * @MethodName userLogin
     * @Author 周万宁
     * @Description 用户登录,返回一个User对象,
     * @Date 22:57 2023/4/4
     * @Param [user]
     * @return com.zhouzhou.SMSServer.pojo.User
     **/
    User userLogin(User user);

    /**
     * @MethodName getUserList
     * @Author 周万宁
     * @Description 获取角色列表
     * @Date 22:58 2023/4/4
     * @Param []
     * @return com.zhouzhou.SMSServer.pojo.User
     **/
    List<User> getUserList();

    /**
     *
     * @param user
     * @return
     */
    int addUser(User user);

}
