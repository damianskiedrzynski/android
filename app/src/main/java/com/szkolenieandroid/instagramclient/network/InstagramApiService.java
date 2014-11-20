package com.szkolenieandroid.instagramclient.network;

import java.util.List;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by dmitry on 20/11/14.
 */
public interface InstagramApiService {

    //https://api.instagram.com/v1/users/17457886/media/recent/?client_id=05040b60aca5430d819dde8bb92818db&count=20
    @GET("/users/{userId}/media/recent/")
    void getUserPhotos(@Path("userId") long userId,@Query("client_id") String clientId,Callback<UserMedia> callback);
}
