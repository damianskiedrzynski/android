package com.szkolenieandroid.instagramclient;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.szkolenieandroid.instagramclient.network.InstagramApiService;
import com.szkolenieandroid.instagramclient.network.UserMedia;
import com.szkolenieandroid.instagramclient.network.UserPhoto;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class UserPhotosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_photos);
        loadPhotos();
    }

    private void loadPhotos() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.instagram.com/v1/")
                .build();
        //https://api.instagram.com/v1/users/17457886/media/recent/?client_id=05040b60aca5430d819dde8bb92818db&count=20

        InstagramApiService service = restAdapter.create(InstagramApiService.class);
        service.getUserPhotos(17457886l, "05040b60aca5430d819dde8bb92818db", new Callback<UserMedia>() {
            @Override
            public void success(UserMedia userMedia, Response response) {
                for(UserPhoto photo:userMedia.getUserPhotos()) {
                    Log.e("user phot url", photo.getPhotoStandardURL());
                }
            }

            @Override
            public void failure(RetrofitError error) {
            }
        });
    }


}
