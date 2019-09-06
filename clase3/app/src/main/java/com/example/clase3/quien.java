package com.example.clase3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quien extends AppCompatActivity {

    private Button boto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quien);

        Button btn2 = (Button) findViewById(R.id.boto2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Calculadora.class);
                startActivityForResult(intent2, 0);
            }
        });
            }
        }