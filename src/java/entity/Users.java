/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SomethingSpecial
 */
public class Users {
    private String accountName,password,username,email;
    private     int role;
    
    public Users() {
    }

    public Users(String accountName, String password, String username, int role, String email) {
        this.accountName = accountName;
        this.password = password;
        this.username = username;
        this.role = role;
        this.email = email;
    }

//    public Users(String accountName, String password, String username, String role) {
//        this.accountName = accountName;
//        this.password = password;
//        this.username = username;
//        this.role = role;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
}
