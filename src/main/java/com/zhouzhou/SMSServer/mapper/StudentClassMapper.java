package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.StudentClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 周万宁
 * @className StudentClassMapper
 * @create 2023/4/3-21:23
 * @description StudentClass的映射接口
 */
public interface StudentClassMapper {

    /**
     * @MethodName getStudentClassAll
     * @Author 周万宁
     * @Description 获取所有班级
     * @Date 22:27 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.StudentClass>
     **/
    List<StudentClass> getStudentClassAll();

    /**
     * @MethodName getStudentClassList
     * @Author 周万宁
     * @Description 获取班级列表(分页)
     * @Date 22:28 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.StudentClass>
     **/
    List<StudentClass> getStudentClassList();

    /**
     * @MethodName insertStudentClass
     * @Author 周万宁
     * @Description 添加新的班级
     * @Date 22:29 2023/4/3
     * @Param [newStudentClass]
     * @return int
     **/
    int insertStudentClass(@Param("newStudentClass") StudentClass newStudentClass);

    /**
     * @MethodName selectStudentClassById
     * @Author 周万宁
     * @Description 根据id获取班级
     * @Date 22:30 2023/4/3
     * @Param [id]
     * @return com.zhouzhou.SMSServer.pojo.StudentClass
     **/
    StudentClass selectStudentClassById(@Param("id") String id);

    /**
     * @MethodName deleteStudentById
     * @Author 周万宁
     * @Description 根据id删除班级
     * @Date 22:32 2023/4/3
     * @Param [id]
     * @return int
     **/
    int deleteStudentById(@Param("id") String id);



}
