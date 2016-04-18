package com.github.zzwwws.submoduletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.zzwwws.sublibrary.MethodTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MethodTest.A();
    }
}
