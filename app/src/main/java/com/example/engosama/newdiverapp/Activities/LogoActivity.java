package com.example.engosama.newdiverapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.engosama.newdiverapp.R;
import com.example.engosama.newdiverapp.Utils.Constants;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Constants.setStatusBarGradiant(this);
        setContentView(R.layout.layout_a_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(LogoActivity.this, SharedActivity.class);
                intent.putExtra("FRAGEMNT","LOGIN");
                startActivity( intent);
                finish();
            }
            // ... Hide splash image and show the real UI
        }, 3000);
    }
}
