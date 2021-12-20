/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.City;
import entity.Travel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class CityDAO {

    public List<City> select() throws Exception {
        List<City> citys = new ArrayList<>();
        String query = "select*from Home";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            String city_id = rs.getString("city_id");
            String city_name = rs.getString("city_name");
            String descriptions = rs.getString("descriptions");
            String imgCity = rs.getString("imgCity");
            citys.add(new City(city_id, city_name, descriptions, imgCity));
        }
        rs.close();
        conn.close();
        return citys;
    }

    public City selectByID(String id) throws Exception {
        City city = null;
        String query = "select*from Home where city_id like '%" + id + "%'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            String city_id = rs.getString("city_id");
            String city_name = rs.getString("city_name");
            String descriptions = rs.getString("descriptions");
            String imgCity = rs.getString("imgCity");
            city = new City(city_id, city_name, descriptions, imgCity);

        }
        rs.close();
        conn.close();
        return city;
    }
}
