package com.example.engosama.newdiverapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.engosama.newdiverapp.Activities.ProDiver_Main;
import com.example.engosama.newdiverapp.R;

public class SingleTrip extends Fragment {

    public SingleTrip() {
        // Required empty public constructor
    }


    public static SingleTrip newInstance(String param1, String param2) {
        SingleTrip fragment = new SingleTrip();
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
        return inflater.inflate(R.layout.layout_f_single_trip, container, false);
    }
    /** TODO this is a way to transfer between fragments...**/
    /** TODO this code will replace 'container_new' in 'layout_a_pro_diver_main' with this fragment...**/
    private void switch_fragment(Fragment fragment){
        ProDiver_Main.fragmentManager = getFragmentManager();
        ProDiver_Main.fragmentTransaction = ProDiver_Main.fragmentManager.beginTransaction();
        ProDiver_Main.fragmentTransaction.replace(R.id.container_new,fragment);
        ProDiver_Main.fragmentTransaction.addToBackStack(null);
        ProDiver_Main.fragmentTransaction.commit();
    }

}
