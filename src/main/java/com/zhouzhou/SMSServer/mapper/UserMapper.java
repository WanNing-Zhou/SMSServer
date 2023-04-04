package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 周万宁
 * @className UserMapper
 * @create 2023/4/3-21:24
 * @description user的映射接口
 */
public interface UserMapper {
    /**
     * @MethodName findUseForLogin
     * @Author 周万宁
     * @Description 根据用户名密码查找用户, 用于登录验证
     * @Date 21:58 2023/4/3
     * @Param [username, password]
     * @return com.zhouzhou.SMSServer.pojo.User
     **/
    User findUseForLogin(@Param("username") String username, @Param("password") String password);

    /**
     * @MethodName findById
     * @Author 周万宁
     * @Description 根据用户id查询用户
     * @Date 21:59 2023/4/3
     * @Param [id]
     * @return com.zhouzhou.SMSServer.pojo.User
     **/
    User findById(@Param("id") String id);

    /**
     * @MethodName updateById
     * @Author 周万宁
     * @Description 根据id更改用户数据, 更改用户数据的时候建议将部分数据进行合并操作
     * @Date 22:00 2023/4/3
     * @Param [id]
     * @return com.zhouzhou.SMSServer.pojo.User
     **/
    User updateById(@Param("id") String id,@Param("newUser") User newUser);

    /**
     * @MethodName getUserList
     * @Author 周万宁
     * @Description 获取用户列表(分页)
     * @Date 22:12 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.User>
     **/
    List<User> getUserList();


    /**
     * @MethodName getUserAll
     * @Author 周万宁
     * @Description 获取所有
     * @Date 22:13 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.User>
     **/
    List<User> getUserAll();

    /**
     * @MethodName addUser
     * @Author 周万宁
     * @Description 添加用户
     * @Date 22:14 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.User>
     **/
    int insertUser(@Param("newUser") User newUser);


    /**
     * @MethodName deleteUserById
     * @Author 周万宁
     * @Description 根据UserId删除User
     * @Date 22:19 2023/4/3
     * @Param [id]
     * @return int
     **/
    int deleteUserById(@Param("id") String id);

    /**
     * @MethodName selectUserByIdAndPassword
     * @Author 周万宁
     * @Description 校验密码是否正确
     * @Date 22:50 2023/4/3
     * @Param [id, password]
     * @return com.zhouzhou.SMSServer.pojo.User
     **/
    User selectUserByIdAndPassword(@Param("id") String id,@Param("password") String password);

}
