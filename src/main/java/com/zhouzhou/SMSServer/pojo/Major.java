package com.zhouzhou.SMSServer.pojo;

/**
 * @author 周万宁
 * @className Major
 * @create 2023/4/3-15:06
 * @description 课程
 */
public class Major {
    private String majorname; //课程名称
    private String id; //课程id

    public Major(){

    }

    public Major(String majorname, String id) {
        this.majorname = majorname;
        this.id = id;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorname='" + majorname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
