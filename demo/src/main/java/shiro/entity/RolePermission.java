package shiro.entity;

import javax.annotation.Resource;

@Resource
public class RolePermission {

    private int id = 0;
    //角色id
    private String role_id = "";
    //权限id
    private String permission_id = "";

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole_id() {
        return role_id;
    }
    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }
    public String getPermission_id() {
        return permission_id;
    }
    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
    }

    @Override
    public String toString() {
        return "RolePermission [id=" + id + ", role_id=" + role_id + ", permission_id=" + permission_id + "]";
    }

}
