package com.goodchild.gigpig.activities.model;

/**
 * Created by User on 2017-03-19.
 */

public class Gig {

    final String DRAWABLE = "drawable/";
    //private String gigID;
    private String gigTitle;
    private String gigDate;
    private String gigtime;
    private String gigLocation;
    private String imgUri;

    public Gig(String gigTitle, String gigDate, String gigtime, String gigLocation,String imgUri) {
       // this.setGigID(gigID);
        this.setGigTitle(gigTitle);
        this.setGigDate(gigDate);
        this.setGigtime(gigtime);
        this.setGigLocation(gigLocation);
        this.setImgUri(imgUri);
    }

    public Gig(String gigTitle, String gigDate) {
     //   this.gigID = gigID;
        this.gigTitle = gigTitle;
        this.gigDate = gigDate;
    }

//    public String getGigID() {
//        return gigID;
//    }
//
//    public void setGigID(String gigID) {
//        this.gigID = gigID;
//    }

    public String getGigTitle() {
        return gigTitle;
    }

    public void setGigTitle(String gigTitle) {
        this.gigTitle = gigTitle;
    }

    public String getGigDate() {
        return gigDate;
    }

    public void setGigDate(String gigDate) {
        this.gigDate = gigDate;
    }

    public String getGigtime() {
        return gigtime;
    }

    public void setGigtime(String gigtime) {
        this.gigtime = gigtime;
    }

    public String getGigLocation() {
        return gigLocation;
    }

    public void setGigLocation(String gigLocation) {
        this.gigLocation = gigLocation;
    }


    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }
}
