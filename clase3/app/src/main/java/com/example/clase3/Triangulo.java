package com.example.clase3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Triangulo extends AppCompatActivity {

    private Spinner sp_figura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        Spinner spinner = (Spinner) findViewById(R.id.sp_figura);

        // Spinner click listener
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> spn,
                                       android.view.View v,
                                       int posicion,
                                       long id) {
                // arg0, View arg1, int arg2, long arg3){
                if (posicion == 0){
                    // Abre una nueva Activity:
                    //  Intent myIntent = new Intent(spn.getContext(), Mostar.class);
                    // startActivity(myIntent);
                }else if(posicion == 1){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), equilatero.class);
                    startActivity(myIntent);
                }else if(posicion == 2){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Isosceles.class);
                    startActivity(myIntent);
                }else if(posicion == 3){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Escaleno.class);
                    startActivity(myIntent);
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });




        // Elementos en Spinner
        List<String> values = new ArrayList<String>();
        values.add("Selecione");
        values.add("Equilátero");
        values.add("Isósceles");
        values.add("Escaleno");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, values);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


    }
}
