package com.szkolenieandroid.instagramclient;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.szkolenieandroid.instagramclient.network.UserPhoto;

/**
 * Created by dmitry on 20/11/14.
 */
public class PhotoFragment extends Fragment{

    private UserPhoto userPhoto;

    public void setUserPhoto(UserPhoto userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.photo_fragment, container, false);
        presentUserPhoto(rootView);
        return rootView;
    }

    private void presentUserPhoto(View rootView) {
        ImageView photoView = (ImageView) rootView.findViewById(R.id.photoImageView);
        Picasso.with(getActivity()).load(userPhoto.getPhotoStandardURL()).into(photoView);
    }
}
