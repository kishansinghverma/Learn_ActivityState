package com.example.learn_activitystate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart",Toast.LENGTH_SHORT).show();
        Log.e("MainActivity", "onStart: called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume",Toast.LENGTH_SHORT).show();
        Log.e("MainActivity", "onResume: called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
        Log.e("MainActivity", "onPause: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"onRestart",Toast.LENGTH_SHORT).show();
        Log.e("MainActivity", "onRestart: called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();
        Log.e("MainActivity","onStop: called");
    }
}
