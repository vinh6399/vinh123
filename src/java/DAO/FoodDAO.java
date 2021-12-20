/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.City;
import entity.Food;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class FoodDAO {

    public List<Food> select() throws Exception {
        List<Food> foods = new ArrayList<>();
        String query = "select*from Food";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int food_id = rs.getInt("food_id");
            String city_id = rs.getString("city_id");
            String name = rs.getString("name");
            String address = rs.getString("FoodAddress");
            String descriptions = rs.getString("descriptions");
            String imgFood = rs.getString("images");
            foods.add(new Food(food_id, city_id, name, address, imgFood, descriptions));
        }
        rs.close();
        conn.close();
        return foods;
    }

    public List<Food> selectFoodByCity(String cityId) throws Exception {
        List<Food> foods = new ArrayList<>();
        String query = "select*from Food where city_id='"+cityId+"'";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int food_id = rs.getInt("food_id");
            String city_id = rs.getString("city_id");
            String name = rs.getString("name");
            String address = rs.getString("FoodAddress");
            String descriptions = rs.getString("descriptions");
            String imgFood = rs.getString("images");
            foods.add(new Food(food_id, city_id, name, address, imgFood, descriptions));
        }
        rs.close();
        conn.close();
        return foods;
    }
}
