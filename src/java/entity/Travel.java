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
public class Travel {

    private String travel_id;
    private String city_id;
    private String travelName;
    private String linkImage;
    private String desc;
    private int status;

    public Travel() {
    }

    public Travel(String travel_id, String city_id, String travelName, String linkImage, String desc, int status) {
        this.travel_id = travel_id;
        this.city_id = city_id;
        this.travelName = travelName;
        this.linkImage = linkImage;
        this.desc = desc;
        this.status = status;
    }

    public Travel(String travel_id, String city_id, String travelName, String linkImage, String desc) {
        this.travel_id = travel_id;
        this.city_id = city_id;
        this.travelName = travelName;
        this.linkImage = linkImage;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTravel_id() {
        return travel_id;
    }

    public void setTravel_id(String travel_id) {
        this.travel_id = travel_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
