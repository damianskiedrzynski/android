package com.szkolenieandroid.instagramclient.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dmitry on 20/11/14.
 */
public class UserMedia {

    @SerializedName("data")
    private List<UserPhoto> userPhotos;

    public List<UserPhoto> getUserPhotos() {
        return userPhotos;
    }
}
