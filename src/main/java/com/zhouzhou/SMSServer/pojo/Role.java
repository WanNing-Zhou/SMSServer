package com.zhouzhou.SMSServer.pojo;

/**
 * @author 周万宁
 * @className Role
 * @create 2023/4/3-15:17
 * @description 角色
 */
public class Role {
    private String id;
    private String name;
    private String auth_name;
    private String auth_time; //授权时间
    private String create_time; //创建时间
    private String menus; //权限列表

    public Role() {
    }

    public Role(String id, String name, String auth_name, String auth_time, String create_time, String menus) {
        this.id = id;
        this.name = name;
        this.auth_name = auth_name;
        this.auth_time = auth_time;
        this.create_time = create_time;
        this.menus = menus;
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

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name;
    }

    public String getAuth_time() {
        return auth_time;
    }

    public void setAuth_time(String auth_time) {
        this.auth_time = auth_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getMenus() {
        return menus;
    }

    public void setMenus(String menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", auth_name='" + auth_name + '\'' +
                ", auth_time='" + auth_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", menus='" + menus + '\'' +
                '}';
    }
}
