package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Método","---------------onCreate--------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Método","---------------onStart--------------");
    }

    @Override
    protected void onStop() {

        Log.i("Método","---------------onStop--------------");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Método","---------------onDestroy--------------");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Método","---------------onPause--------------");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Método","---------------onResume--------------");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Método","---------------onRestart--------------");

    }
}
