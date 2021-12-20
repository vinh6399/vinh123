/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import DAO.CityDAO;
import DAO.FoodDAO;
import DAO.TravelDAO;
import java.util.List;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class City {

    private String city_id;
    private String city_name;
    private String descriptions;
    private String imgCity;

    public City(String city_id, String city_name, String descriptions, String imgCity) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.descriptions = descriptions;
        this.imgCity = imgCity;
    }

    public City() {
    }

    public String getImgCity() {
        return imgCity;
    }

    public void setImgCity(String imgCity) {
        this.imgCity = imgCity;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getString(String id) throws Exception {
        return new TravelDAO().select(id).get(0).getLinkImage();
    }

    public String getBackGround() throws Exception {
        return new TravelDAO().select(city_id).get(0).getLinkImage();
    }
    public List<Food> getFoods() throws Exception{
        return new FoodDAO().selectFoodByCity(city_id);
    }
    public List<Travel> getTravels() throws Exception {
        return new TravelDAO().selectAll(city_id);
    }
}
