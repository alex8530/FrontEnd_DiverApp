package com.example.engosama.newdiverapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.engosama.newdiverapp.Activities.SharedActivity;
import com.example.engosama.newdiverapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Diver_Profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Diver_Profile extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Diver_Profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Diver_Profile.
     */
    // TODO: Rename and change types and number of parameters
    public static Diver_Profile newInstance(String param1, String param2) {
        Diver_Profile fragment = new Diver_Profile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.layout_f_diver_profile, container, false);



        Button button_verify_phone=view.findViewById(R.id.button_edit);

        button_verify_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),SharedActivity.class);
                intent.putExtra("FRAGEMNT" , "EDIT_PROFILE");
                startActivity(intent);
            }
        });

        return view;
    }

}
