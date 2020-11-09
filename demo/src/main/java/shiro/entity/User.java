package shiro.entity;

import java.util.Date;

import javax.annotation.Resource;

@Resource
public class User {

    //ID
    private int id = 0;
    //用户id
    private String user_id = "";
    //用户名
    private String username = "";
    //
    private String password = "";
    //加密盐值
    private String salt = "";
    //邮箱
    private String email = "";
    //联系方式
    private String phone = "";
    //年龄：1男2女
    private int sex = 1;
    //年龄
    private int age = 1;
    //用户状态：1有效; 2删除
    private int status = 1;
    //创建时间
    private Date create_time = null;
    //更新时间
    private Date update_time = null;
    //最后登录时间
    private Date last_login_time = null;

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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
    public Date getLast_login_time() {
        return last_login_time;
    }
    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", user_id=" + user_id + ", username=" + username + ", password=" + password
                + ", salt=" + salt + ", email=" + email + ", phone=" + phone + ", sex=" + sex + ", age=" + age
                + ", status=" + status + ", create_time=" + create_time + ", update_time=" + update_time
                + ", last_login_time=" + last_login_time + "]";
    }

}
