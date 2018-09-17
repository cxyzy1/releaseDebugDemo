package com.cxyzy.leakcanary_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LeakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        LeakManager.addMe(this);

    }
}
