package com.goodchild.gigpig.activities.model;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by User on 2017-03-21.
 */

public class Band {

    final String DRAWABLE = "drawable/";
    private String bandName;
    private String bandGenre;
    private String bandDescription;
    private String bandMembers;
    private String imgBandUri;


    public Band(String bandName, String bandGenre, String bandDescription, String bandMembers, String imgBandUri) {
        this.bandName = bandName;
        this.bandGenre = bandGenre;
        this.bandDescription = bandDescription;
        this.bandMembers = bandMembers;
        this.imgBandUri = imgBandUri;
    }

    public Band(String bandName, String imgBandUri) {
        this.bandName = bandName;
        this.imgBandUri = imgBandUri;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandGenre() {
        return bandGenre;
    }

    public void setBandGenre(String bandGenre) {
        this.bandGenre = bandGenre;
    }

    public String getBandDescription() {
        return bandDescription;
    }

    public void setBandDescription(String bandDescription) {
        this.bandDescription = bandDescription;
    }

    public String getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(String bandMembers) {
        this.bandMembers = bandMembers;
    }

    public String getImgBandUri() {
        return DRAWABLE + imgBandUri;
    }

    public void setImgBandUri(String imgBandUri) {
        this.imgBandUri = imgBandUri;
    }
}