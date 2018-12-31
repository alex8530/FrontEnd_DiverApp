package com.example.engosama.newdiverapp.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;

import com.example.engosama.newdiverapp.Fragments.Add_Trip;
import com.example.engosama.newdiverapp.Fragments.Checkout_ProDiver;
import com.example.engosama.newdiverapp.Fragments.EditProfile;
import com.example.engosama.newdiverapp.Fragments.Login;
import com.example.engosama.newdiverapp.Fragments.MyAccount;
import com.example.engosama.newdiverapp.Fragments.ProDiver_Profile;
import com.example.engosama.newdiverapp.Fragments.SignUp;
import com.example.engosama.newdiverapp.R;

public class SharedActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    Fragment fragment=new Fragment();
    Fragment loginFragment=new Login();
    Fragment editProfile= new EditProfile();
    Fragment editProfilePro= new EditProfile();
    Fragment myAccount= new MyAccount();
    Fragment checkout= new Checkout_ProDiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        fragmentManager = getSupportFragmentManager();
        if (getIntent() !=null)
        {
            if (getIntent().getStringExtra("FRAGEMNT") !=null){
                if (getIntent().getStringExtra("FRAGEMNT").equals("LOGIN")){
                    fragment=loginFragment;
                }
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
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //this is for animation between fragments
        transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        transaction.replace(R.id.sharedContainer, fragment).commit();


        //this is for animation the activity
        initAnimation();


    }
    public static void  switch_fragment(Fragment fragment){
        FragmentTransaction transaction =  fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        transaction.replace(R.id.sharedContainer, fragment).commit();
    }

    private void initAnimation() {
        Explode enterTransition = new Explode();
        enterTransition.setDuration(3000);
        getWindow().setEnterTransition(enterTransition);
    }


    @Override
    public void onBackPressed() {
        //switch fragment
        SharedActivity.switch_fragment(new Login());
    }
}
