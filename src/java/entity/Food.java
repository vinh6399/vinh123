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
public class Food {
    private  int foodId;
    private String cityId,foodName,address,imgFood,descFood;

    public Food() {
    }

    public Food(int foodId, String cityId, String foodName, String address, String imgFood, String descFood) {
        this.foodId = foodId;
        this.cityId = cityId;
        this.foodName = foodName;
        this.address = address;
        this.imgFood = imgFood;
        this.descFood = descFood;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgFood() {
        return imgFood;
    }

    public void setImgFood(String imgFood) {
        this.imgFood = imgFood;
    }

    public String getDescFood() {
        return descFood;
    }

    public void setDescFood(String descFood) {
        this.descFood = descFood;
    }
    
}
