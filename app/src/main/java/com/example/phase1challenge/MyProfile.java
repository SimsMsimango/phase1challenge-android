package com.example.phase1challenge;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.logging.Logger;

import static com.example.phase1challenge.GeneralHelper.isNotNullOrEmpty;

public class MyProfile extends AppCompatActivity {
    Logger logger = Logger.getLogger(getClass().getName());
    private static final String TV_STRING_SEPARATOR = "  ";

    private ImageView ivProfilePicture;
    private TextView tvProfileName;
    private TextView tvTrackName;
    private TextView tvCountryName;
    private TextView tvEmailAddress;
    private TextView tvPhoneNumber;
    private TextView tvSlackUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (isNotNullOrEmpty(getSupportActionBar())) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        initializeViews();
        setProfileDetails();
    }

    private void initializeViews() {
        ivProfilePicture = findViewById(R.id.ivProfilePicture);
        tvTrackName = findViewById(R.id.tv_my_track_name);
        tvProfileName = findViewById(R.id.tv_my_profile_name);
        tvCountryName = findViewById(R.id.tv_my_country_name);
        tvPhoneNumber = findViewById(R.id.tv_my_phone_number);
        tvEmailAddress = findViewById(R.id.tv_my_email_address);
        tvSlackUsername = findViewById(R.id.tv_my_slack_username);
    }

    private void setProfileDetails() {
        String reducedProfileName = getString(R.string.profileName);
        String reducedTrackName = tvTrackName.getText() + TV_STRING_SEPARATOR + getString(R.string.trackName);
        String reducedCountryName = tvCountryName.getText() + TV_STRING_SEPARATOR + getString(R.string.countryName);
        String reducedPhoneNumber = tvPhoneNumber.getText() + TV_STRING_SEPARATOR + getString(R.string.phoneNumber);
        String reducedEmailAddress = tvEmailAddress.getText() + TV_STRING_SEPARATOR + getString(R.string.emailAddress);
        String reducedSlackUsername = tvSlackUsername.getText() + TV_STRING_SEPARATOR + getString(R.string.slackUsername);

        ivProfilePicture.setImageResource(R.mipmap.ic_launcher_foreground_profile_picture);
        tvTrackName.setText(reducedTrackName);
        tvProfileName.setText(reducedProfileName);
        tvCountryName.setText(reducedCountryName);
        tvPhoneNumber.setText(reducedPhoneNumber);
        tvEmailAddress.setText(reducedEmailAddress);
        tvSlackUsername.setText(reducedSlackUsername);
    }
}
