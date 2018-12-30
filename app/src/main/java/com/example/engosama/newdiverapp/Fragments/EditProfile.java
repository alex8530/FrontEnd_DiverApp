package com.example.engosama.newdiverapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.engosama.newdiverapp.Activities.ProDiver_Main;
import com.example.engosama.newdiverapp.R;


public class EditProfile extends Fragment {

    public EditProfile() {
        // Required empty public constructor
    }



    public static EditProfile newInstance(String param1, String param2) {
        EditProfile fragment = new EditProfile();
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
       View view  =  inflater.inflate(R.layout.layout_f_edit_profile, container, false);
        Button button_start_verification= view.findViewById(R.id.button_start_verification);
        button_start_verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return view;
    }


}
