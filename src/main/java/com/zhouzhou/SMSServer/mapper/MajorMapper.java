package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.Major;

import java.util.List;

/**
 * @author 周万宁
 * @className MajorMapper
 * @create 2023/4/3-20:09
 * @description Major的映射接口
 */
public interface MajorMapper {
    List<Major> getMajorList();

}
