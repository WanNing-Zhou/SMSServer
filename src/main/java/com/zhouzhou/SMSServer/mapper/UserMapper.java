package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.User;

/**
 * @author 周万宁
 * @className UserMapper
 * @create 2023/4/3-21:24
 * @description user的映射接口
 */
public interface UserMapper {
    User findUseForLogin(String username,String password);
}
