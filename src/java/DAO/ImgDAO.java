/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.City;
import entity.Images;
import entity.Travel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class ImgDAO {
     public List<Images> selectByTravelId(String id) throws Exception {
        List<Images> img = new ArrayList<>();
         String query = "select * from Images where travel_id='" + id + "'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {

           String img_id = rs.getString("image_id");
            String travel_id = rs.getString("travel_id");
            String linkImg = rs.getString("imageLink");
            String nameImg = rs.getString("name");
            String descriptions = rs.getString("IMGdesc");
            img.add( new Images(img_id, travel_id, linkImg, nameImg, descriptions));
        }
        rs.close();
        conn.close();
        return img;
    }
}
