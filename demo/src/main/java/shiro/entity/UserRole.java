package shiro.entity;

import javax.annotation.Resource;

@Resource
public class UserRole {

    private int id = 0;
    //用户id
    private String user_id = "";
    //角色id
    private String role_id = "";

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getRole_id() {
        return role_id;
    }
    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "UserRole [id=" + id + ", user_id=" + user_id + ", role_id=" + role_id + "]";
    }

}
