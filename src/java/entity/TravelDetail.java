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
public class TravelDetail {
   private  String id;
    private  String name;
    private String video;
    private String content;
    private  String dateUpload;

    public TravelDetail() {
    }

    public TravelDetail(String id, String name, String video, String content, String dateUpload) {
        this.id = id;
        this.name = name;
        this.video = video;
        this.content = content;
        this.dateUpload = dateUpload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(String dateUpload) {
        this.dateUpload = dateUpload;
    }
    
    
}
