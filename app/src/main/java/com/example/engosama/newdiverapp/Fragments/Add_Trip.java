package com.example.engosama.newdiverapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.engosama.newdiverapp.R;

public class Add_Trip extends Fragment {


    public Add_Trip() {
        // Required empty public constructor
    }

    public static Add_Trip newInstance(String param1, String param2) {
        Add_Trip fragment = new Add_Trip();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_f_add__trip, container, false);
    }

}
