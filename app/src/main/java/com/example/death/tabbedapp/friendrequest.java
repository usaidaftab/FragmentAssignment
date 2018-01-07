package com.example.death.tabbedapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Death on 12/21/2017.
 */

public class friendrequest extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

            View myview=inflater.inflate(R.layout.friendrequest,null);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
