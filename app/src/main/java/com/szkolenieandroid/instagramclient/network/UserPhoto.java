package com.szkolenieandroid.instagramclient.network;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dmitry on 20/11/14.
 */
public class UserPhoto {

    @SerializedName("images")
    private LocalImages images;


    public String getPhotoStandardURL() {
        return images.standardResolution.url;
    }
    class LocalImages {
        @SerializedName("standard_resolution")
        private LocalImage standardResolution;
    }

    class LocalImage {

        private String url;
    }
}
