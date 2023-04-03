package com.zhouzhou.SMSServer.pojo;

/**
 * @author 周万宁
 * @className Student
 * @create 2023/4/3-19:40
 * @description 学员
 */
public class Student {
    private String id; // 学员id
    private String name; // 学员姓名
    private String gender; //性别
    private String major; //课程
    private String direction;//课程类型
    private String phone; // 电话
    private int admission_data; //入学时间
    private String teacher_id;//教练id
    private String manager_id;// 学员管理员id
    private String pictures; // 照片路径

    public Student() {
    }

    public Student(String id, String name, String gender, String major, String direction, String phone, int admission_data, String teacher_id, String manager_id, String pictures) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.major = major;
        this.direction = direction;
        this.phone = phone;
        this.admission_data = admission_data;
        this.teacher_id = teacher_id;
        this.manager_id = manager_id;
        this.pictures = pictures;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAdmission_data() {
        return admission_data;
    }

    public void setAdmission_data(int admission_data) {
        this.admission_data = admission_data;
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

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", direction='" + direction + '\'' +
                ", phone='" + phone + '\'' +
                ", admission_data=" + admission_data +
                ", teacher_id='" + teacher_id + '\'' +
                ", manager_id='" + manager_id + '\'' +
                ", pictures='" + pictures + '\'' +
                '}';
    }
}
