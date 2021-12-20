/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.Travel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class TravelDAO {

    public List<Travel> select(String cityID) throws Exception {
        List<Travel> Travels = new ArrayList<>();
        String query = "select*from Travel where city_id = '" + cityID + "'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int status = rs.getInt("Tstatus");
            if(status==0) continue;
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
    public List<Travel> selectAll(String cityID) throws Exception {
        List<Travel> Travels = new ArrayList<>();
        String query = "select*from Travel where city_id = '" + cityID + "'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {

            String travel_id = rs.getString("travel_id");
            String city_id = rs.getString("city_id");
            String travelName = rs.getString("travelname");
            String linkImage = rs.getString("images");
            String desc = rs.getString("descriptions");
            int status = rs.getInt("Tstatus");
            Travels.add(new Travel(travel_id, city_id, travelName, linkImage, desc,status));
        }
        rs.close();
        conn.close();
        return Travels;
    }

    public Travel selectByTravelId(String cityID) throws Exception {
//        List<Travel> Travels = new ArrayList<>();
        Travel travel = null;
        String query = "select * from Travel where travel_id='" + cityID + "'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            
            int status = rs.getInt("Tstatus");
            if(status==0) continue;
            String travel_id = rs.getString("travel_id");
            String city_id = rs.getString("city_id");
            String travelName = rs.getString("travelname");
            String linkImage = rs.getString("images");
            String desc = rs.getString("descriptions");
            travel = new Travel(travel_id, city_id, travelName, linkImage, desc);
        }
        rs.close();
        conn.close();
        return travel;
    }

    public List<Travel> searchDAO(String mess) throws Exception {
        List<Travel> Travels = new ArrayList<>();
        String query = "select * from Travel where travelname like N'%"+mess+"%' or descriptions like N'%"+mess+"%'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int status = rs.getInt("Tstatus");
            if(status==0) continue;
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
      public void UpdateTstatus(String id,int status) {                                   //Chưa sửa
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE Travel SET Tstatus = "+status+" WHERE travel_id='"+id+"'";
//            String s1 = "insert into Categories values(?,?,?)";
            int rs = conn.prepareStatement(sql).executeUpdate();

            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection ERROR!!");
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
