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
 * Use the {@link ProDiver_Profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProDiver_Profile extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ProDiver_Profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProDiver_Profile.
     */
    // TODO: Rename and change types and number of parameters
    public static ProDiver_Profile newInstance(String param1, String param2) {
        ProDiver_Profile fragment = new ProDiver_Profile();
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

        View view =  inflater.inflate(R.layout.layout_f_pro_diver_profile, container, false);



        Button button_verify_phone=view.findViewById(R.id.button_edit);
        Button btn_charch=view.findViewById(R.id.btn_charch);

        button_verify_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),SharedActivity.class);
                intent.putExtra("FRAGEMNT" , "EDIT_PROFILE_DIVER_PRO");
                startActivity(intent);
            }
        });


        btn_charch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),SharedActivity.class);
                intent.putExtra("FRAGEMNT" , "MyAccount_DIVER_PRO");
                startActivity(intent);
            }
        });

        return view;
    }

}
