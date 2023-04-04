package com.zhouzhou.SMSServer.pojo;

/**
 * @author 周万宁
 * @className User
 * @create 2023/4/3-19:51
 * @description 用户
 */


public class User {
    private String id; // id
    private String username; //用户名
    private String name;//用户姓名
    private String password; //密码
    private String phone; //用户电话
    private int create_time;//创建时间
    private String role_id; //用户角色id

    public User() {

    }

    public User (String username,String password){
        this.username = username;
        this.password = password;
    }

    public User(String id, String username, String name, String password, String phone, int create_time, String role_id) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.create_time = create_time;
        this.role_id = role_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", create_time=" + create_time +
                ", role_id='" + role_id + '\'' +
                '}';
    }
}
