/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class ListSave {
    private String username,travelid;

    public ListSave() {
    }

    public ListSave(String username, String travelid) {
        this.username = username;
        this.travelid = travelid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTravelid() {
        return travelid;
    }

    public void setTravelid(String travelid) {
        this.travelid = travelid;
    }
    
}
