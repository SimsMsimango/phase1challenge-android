package com.example.phase1challenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAboutAlc;
    private Button btnMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initializeViews();
        addListeners();
    }

    private void addListeners() {
        btnAboutAlc.setOnClickListener(this);
        btnMyProfile.setOnClickListener(this);
    }

    private void initializeViews() {
        btnAboutAlc = findViewById(R.id.about_alc_btn);
        btnMyProfile = findViewById(R.id.my_profile_btn);
    }



    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        switch (viewId) {
            case R.id.about_alc_btn:
                loadAboutAlcActivity();
                break;
            case R.id.my_profile_btn:
                loadProfileActivity();
                break;
        }
    }

    private void loadAboutAlcActivity() {
        startActivity(new Intent(this, AboutAlc.class));
    }

    private void loadProfileActivity() {
        startActivity(new Intent(this, MyProfile.class));
    }
}
