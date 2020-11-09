package shiro.entity;

import java.util.Date;

import javax.annotation.Resource;

@Resource
public class Role {

    private int id = 0;
    //角色id
    private String role_id = "";
    //角色名称
    private String name = "";
    //角色描述
    private String description= "";
    //状态：1有效；2删除
    private int status = 1;
    //创建时间
    private Date create_time = null;
    //更新时间
    private Date update_time = null;

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public Date getUpdate_time() {
        return update_time;
    }
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Role [id=" + id + ", role_id=" + role_id + ", name=" + name + ", description=" + description
                + ", status=" + status + ", create_time=" + create_time + ", update_time=" + update_time + "]";
    }

}
