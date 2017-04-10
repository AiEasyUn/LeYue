package com.marktony.zhihudaily.license;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marktony.zhihudaily.R;

public class OpenSourceLicenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);

        OpenSourceLicenseFragment fragment = OpenSourceLicenseFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit();

    }

}
