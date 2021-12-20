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
public class Images {
    private String image_id;
    private String travel_id;
    private String linkImage;
    private String name;
    private String imgDecs;

    public Images() {
    }

    public Images(String image_id, String travel_id, String linkImage, String name, String imgDecs) {
        this.image_id = image_id;
        this.travel_id = travel_id;
        this.linkImage = linkImage;
        this.name = name;
        this.imgDecs = imgDecs;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getTravel_id() {
        return travel_id;
    }

    public void setTravel_id(String travel_id) {
        this.travel_id = travel_id;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgDecs() {
        return imgDecs;
    }

    public void setImgDecs(String imgDecs) {
        this.imgDecs = imgDecs;
    }
    
    
    
}
