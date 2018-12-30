package com.example.engosama.newdiverapp.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.engosama.newdiverapp.Fragments.Checkout_ProDiver;
import com.example.engosama.newdiverapp.Fragments.EditProfile;
import com.example.engosama.newdiverapp.Fragments.MyAccount;
import com.example.engosama.newdiverapp.Fragments.ProDiver_Profile;
import com.example.engosama.newdiverapp.R;

public class SharedActivity extends AppCompatActivity {

    Fragment fragment=new Fragment();
    Fragment editProfile= new EditProfile();
    Fragment editProfilePro= new EditProfile();
    Fragment myAccount= new MyAccount();
    Fragment checkout= new Checkout_ProDiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        if (getIntent() !=null)
        {
            if (getIntent().getStringExtra("FRAGEMNT") !=null){
                if (getIntent().getStringExtra("FRAGEMNT").equals("EDIT_PROFILE_DIVER")){
                    fragment=editProfile;
                }
                if (getIntent().getStringExtra("FRAGEMNT").equals("EDIT_PROFILE_DIVER_PRO")){
                    fragment=editProfilePro;
                }
                if (getIntent().getStringExtra("FRAGEMNT").equals("MyAccount_DIVER_PRO")){
                    fragment=myAccount;
                }
                if (getIntent().getStringExtra("FRAGEMNT").equals("Checkout_ProDiver_DIVER_PRO")){
                    fragment=checkout;
                }
            }
        }

        //switch fragment
      getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment).commit();

    }
}
