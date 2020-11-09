package shiro.entity;

import java.util.Date;

import javax.annotation.Resource;

@Resource
public class Permission {

    private int id = 0;
    //权限id
    private String permission_id = "";
    //权限名称
    private String name = "";
    //权限描述
    private String description = "";
    //权限访问路径
    private String url = "";
    //权限标识
    private String perms = "";
    //父级权限id
    private int parent_id = 0;
    //类型   0：目录   1：菜单   2：按钮
    private int type = 0;
    //排序
    private int order_num = 0;
    //图标
    private String icon = "";
    //状态：1有效；2删除
    private int status = 0;

    private Date create_time = null;

    private Date update_time = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getOrder_num() {
        return order_num;
    }

    public void setOrder_num(int order_num) {
        this.order_num = order_num;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
        return "Permission [id=" + id + ", permission_id=" + permission_id + ", name=" + name + ", description="
                + description + ", url=" + url + ", perms=" + perms + ", parent_id=" + parent_id + ", type=" + type
                + ", order_num=" + order_num + ", icon=" + icon + ", status=" + status + ", create_time=" + create_time
                + ", update_time=" + update_time + "]";
    }

}
