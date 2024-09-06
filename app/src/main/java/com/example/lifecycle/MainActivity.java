package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("myFirstApp","I am onCreate ");
        Toast.makeText(getApplicationContext(), "I am onCreate",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "I am onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "I am onResume", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "I am onPause", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "I am onStop", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "I am onRestart", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "I am onDestroy", Toast.LENGTH_SHORT).show();

    }
}



