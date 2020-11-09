package sys.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

@Repository
public class DataSource {

    @Autowired
    private DruidDataSource druidDataSource;

    String sql = "select * from sys_roles;";

    public void getDS() {

        try {
            DruidPooledConnection dc = druidDataSource.getConnection();
            Connection con = dc.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { // 循环遍历结果集里面的所有记录
                String role = rs.getString("role");
                String description = rs.getString("description");
                System.out.print("Role " + role + " Description " + description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
