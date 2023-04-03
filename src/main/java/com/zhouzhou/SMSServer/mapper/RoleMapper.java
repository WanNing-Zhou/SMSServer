package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.Role;

import java.util.List;

/**
 * @author 周万宁
 * @className RoleMapper
 * @create 2023/4/3-20:11
 * @description Role的映射接口
 */
public interface RoleMapper {
    List<Role> getRoleList();
}
