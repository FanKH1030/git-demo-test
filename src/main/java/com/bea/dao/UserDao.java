package com.bea.dao;

import com.bea.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fandi on 2019/11/17 0017.
 */
public class UserDao implements IUserDao {
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        String sql = "select * from t_user";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///goods", "root", "123456");
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String uid = rs.getString("uid");
                String loginusername = rs.getString("loginname");
                String loginpassword = rs.getString("loginpass");

                User user = new User(uid, loginusername, loginpassword);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        return users;
    }
}
