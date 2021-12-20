/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.City;
import entity.Users;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SomethingSpecial
 */
public class UserDAO implements Serializable {

    private final DBContext db = new DBContext();
    private Connection con = null;

    public List<Users> select() throws Exception {
        List<Users> lists = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement statement = null;
        try {
            con = db.getConnection();
            String query = "select * from Users";
            statement = con.prepareStatement(query);
            rs = statement.executeQuery();
            String temp;
            while (rs.next()) {
                String accountname = rs.getString("name");
                String password = rs.getString("pass");
                String username = rs.getString("username");
                String email = rs.getString("email");
                int role = rs.getInt("role");

                Users u = new Users(accountname, password, username, role, email);
                lists.add(u);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (rs != null && !rs.isClosed()) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
            if (statement != null && !statement.isClosed()) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
        return lists;
    }

    //insert into users table
    public void insertNewUser(Users u) throws Exception {
        PreparedStatement statement = null;
        try {
            con = db.getConnection();
            String query = "insert into users values (?,?,?,?,?)";
            statement = con.prepareStatement(query);
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            statement.setString(3, u.getAccountName());
            statement.setInt(4, 0);
            statement.setString(5, u.getEmail());
            statement.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (statement != null && !statement.isClosed()) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public void updateBlock(String username, int role) throws Exception {
        PreparedStatement statement = null;
        try {
            con = db.getConnection();
            String query = "update users set role = ? where username=?";
            statement = con.prepareStatement(query);
            statement.setInt(1, role);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (statement != null && !statement.isClosed()) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
        public void updateInfo(String name, String email,String username) throws Exception {
        PreparedStatement statement = null;
        try {
            con = db.getConnection();
            String query = "update users set name = N'"+name+"', email = N'"+email+"' where username='"+username+"'";
            statement = con.prepareStatement(query);
//            statement.setString(1, name);
//            statement.setString(2, email);
//            statement.setString(3, username);
            statement.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (statement != null && !statement.isClosed()) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    public void updatePass(String username, String pass) throws Exception {
        PreparedStatement statement = null;
        try {
            con = db.getConnection();
            String query = "update users set pass = ? where username=?";
            statement = con.prepareStatement(query);
            statement.setString(1, pass);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (statement != null && !statement.isClosed()) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
}
