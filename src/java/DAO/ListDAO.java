/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.City;
import entity.ListSave;
import entity.Travel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class ListDAO {

    public void insertList(String username, String Id) throws Exception {
        //    List<role> users = new ArrayList<>();
        //lech search
        String query = "INSERT INTO ListFV(username ,travel_id)VALUES('" + username + "','" + Id + "')";
        Connection conn = new DBContext().getConnection();
        int rs = conn.prepareStatement(query).executeUpdate();
//        rs.close();
        conn.close();
    }

    public void deleByTravelId(String username, String Id) throws Exception {
        //    List<role> users = new ArrayList<>();
        //lech search
        String query = "delete from ListFV where travel_id like '"+Id+"' and username = '"+username+"'";
        Connection conn = new DBContext().getConnection();
        int rs = conn.prepareStatement(query).executeUpdate();
//        rs.close();
        conn.close();
    }

    public List<ListSave> select(String username) throws Exception {
        List<ListSave> citys = new ArrayList<>();
        String query = "select * from ListFV where username = '" + username + "'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            String userName = rs.getString("username");
            String travel_id = rs.getString("travel_id");
            citys.add(new ListSave(userName, travel_id));
        }
        rs.close();
        conn.close();
        return citys;
    }

    public List<Travel> selectListByUsername(String username) throws Exception {
        List<Travel> Travels = new ArrayList<>();
        String query = "select t.* from ListFV l,Travel t where l.username='" + username + "' and l.travel_id = t.travel_id";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {

            String travel_id = rs.getString("travel_id");
            String city_id = rs.getString("city_id");
            String travelName = rs.getString("travelname");
            String linkImage = rs.getString("images");
            String desc = rs.getString("descriptions");
            Travels.add(new Travel(travel_id, city_id, travelName, linkImage, desc));
        }
        rs.close();
        conn.close();
        return Travels;
    }
}
