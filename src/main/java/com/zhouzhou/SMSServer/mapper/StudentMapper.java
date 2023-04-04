package com.zhouzhou.SMSServer.mapper;

import com.zhouzhou.SMSServer.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 周万宁
 * @className StudentMapper
 * @create 2023/4/3-21:22
 * @description Student的映射接口
 */

public interface StudentMapper {

    /**
     * @MethodName getStudentList
     * @Author 周万宁
     * @Description 获取学生列表(分页)
     * @Date 22:34 2023/4/3
     * @Param []
     * @return java.util.List<com.zhouzhou.SMSServer.pojo.Student>
     **/
    List<Student> getStudentList();

    /**
     * @MethodName insertStudent
     * @Author 周万宁
     * @Description 添加学员
     * @Date 22:35 2023/4/3
     * @Param [newStudent]
     * @return int
     **/
    int insertStudent(@Param("newStudent") Student newStudent);

    /**
     * @MethodName selectStudentId
     * @Author 周万宁
     * @Description 根据id查询获取学员信息
     * @Date 22:37 2023/4/3
     * @Param [id]
     * @return com.zhouzhou.SMSServer.pojo.Student
     **/
    Student selectStudentById(@Param("id") String id);

    /**
     * @MethodName updateStudentById
     * @Author 周万宁
     * @Description 根据学员id更新学员信息
     * @Date 22:46 2023/4/3
     * @Param [newStudent]
     * @return int
     **/
    int updateStudentById(@Param("newStudent") Student newStudent);

    /**
     * @MethodName deleteStudentById
     * @Author 周万宁
     * @Description 根据id删除学员
     * @Date 22:47 2023/4/3
     * @Param [id]
     * @return int
     **/
    int deleteStudentById(@Param("id") String id);

}
