package com.example.vamshi.retrofittrial.Data;


/**
 * Created by Vamshi on 6/16/2017.
 */

public class Steps {



    private String id;
    private String shortDescription;
    private String description;
    private String videoURL;

    public Steps(String id, String shortDescription, String description, String videoURL) {

        this.id = id;
        this.shortDescription = shortDescription;
        this.description = description;
        this.videoURL = videoURL;
    }

    public Steps(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }
}
