/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.Travel;
import entity.TravelDetail;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class TravelDetailDAO {

    public TravelDetail select(String cityID) throws Exception {
        TravelDetail Travels = null;
        String query = "select*from TravelDetail where travel_id ='"+cityID+"'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {

            String travel_id = rs.getString("travel_id");
            String name = rs.getString("name");
            String video = rs.getString("video");
            String content = rs.getString("content");
            String date = rs.getString("dateupload");
           Travels = new TravelDetail(travel_id, name, video, content, date);
        }
        rs.close();
        conn.close();
        return Travels;
    }
}
