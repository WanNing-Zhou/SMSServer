package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 周万宁
 * @className RoleMapper
 * @create 2023/4/3-20:11
 * @description Role的映射接口
 */
public interface RoleMapper {
    /**
     * @MethodName getRoleList
     * @Author 周万宁
     * @Description 获取角色列表
     * @Date 22:21 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.Role>
     **/
    List<Role> getRoleList();

    /**
     * @MethodName insertRole
     * @Author 周万宁
     * @Description 创建新的角色
     * @Date 22:22 2023/4/3
     * @Param [newRole]
     * @return int
     **/
    int insertRole(@Param("newRole") Role newRole);

    /**
     * @MethodName updateRole
     * @Author 周万宁
     * @Description 更新角色(设置角色权限)
     * @Date 22:24 2023/4/3
     * @Param []
     * @return int
     **/
    int updateRole(@Param("newRole") Role newRole);



}
