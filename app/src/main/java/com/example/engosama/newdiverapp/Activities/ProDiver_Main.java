package com.example.engosama.newdiverapp.Activities;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.engosama.newdiverapp.Fragments.Add_Trip;
import com.example.engosama.newdiverapp.Fragments.AllTrips;
import com.example.engosama.newdiverapp.Fragments.Notification;
import com.example.engosama.newdiverapp.Fragments.ProDiver_Profile;
import com.example.engosama.newdiverapp.R;

public class ProDiver_Main extends AppCompatActivity {
    public BottomNavigationView bottom_navigation;
    public static FragmentManager fragmentManager;
    public static Fragment fragment, Add_Trip,Notification,ProDiver_Profile,AllTrips;
    public static FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_a_pro_diver_main);
        Add_Trip = new Add_Trip();
        Notification = new Notification();
        ProDiver_Profile = new ProDiver_Profile();
        AllTrips = new AllTrips();
        fragment = new Fragment();
        /*********************Button Navigation View ****************************/
        bottom_navigation =   findViewById(R.id.bottom_navigation);
        fragmentManager = getSupportFragmentManager();
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.pro_diver:
                        fragment = ProDiver_Profile;
                        break;
                    case R.id.notification:
                        fragment = Notification;
                        break;
                    case R.id.add_trip:
                        fragment = Add_Trip;
                        break;
                    case R.id.all_trips:
                        fragment = AllTrips;
                        break;
                    default:
                        fragment = ProDiver_Profile;
                        break;
                }


                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                //this is for animation between fragments
                transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
                transaction.replace(R.id.container_new, fragment).commit();
                return true;
            }
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container_new, fragment);
        transaction.commit();
        bottom_navigation.setSelectedItemId(R.id.pro_diver);
//        ****************************************************************************
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottom_navigation.getChildAt(0);

        for (int i = 0; i < menuView.getChildCount(); i++) {
            final View iconView = menuView.getChildAt(i).findViewById(android.support.design.R.id.icon);
            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 28, displayMetrics);
            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 28, displayMetrics);
            iconView.setLayoutParams(layoutParams);
        }
        /**************************************************************************/
    }

    public static void  switch_fragment(Fragment fragment){
       FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        transaction.replace(R.id.container_new, fragment).commit();
    }
}
