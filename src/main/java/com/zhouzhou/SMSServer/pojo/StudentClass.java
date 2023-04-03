package com.zhouzhou.SMSServer.pojo;

/**
 * @author 周万宁
 * @className StudentClassMapper
 * @create 2023/4/3-15:02
 * @description 班级
 */

public class StudentClass {

    private String id; //课程id
    private String name; //班级名称
    private String teacher_id; // 教师id
    private String manager_id; //学员管理员id
    private String stage; //阶段


    public StudentClass() {
    }

    public StudentClass(String name, String teacher_id, String manager_id, String stage, String id) {
        this.name = name;
        this.teacher_id = teacher_id;
        this.manager_id = manager_id;
        this.stage = stage;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentClassMapper{" +
                "name='" + name + '\'' +
                ", teacher_id='" + teacher_id + '\'' +
                ", manager_id='" + manager_id + '\'' +
                ", stage='" + stage + '\'' +
                '}';
    }
}
