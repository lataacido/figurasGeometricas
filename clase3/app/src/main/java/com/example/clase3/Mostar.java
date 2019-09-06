package com.example.clase3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mostar extends AppCompatActivity {

    private EditText etResul;
    private Button botonact2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostar);

        //Importamos texto de calculadora
        Bundle bundle = getIntent().getExtras();
        String fraseimportada = bundle.getString("frase");



        String etResul = fraseimportada;
        TextView out = (EditText)findViewById(R.id.etResul);
        out.setText(etResul);

        Button btn2 = (Button) findViewById(R.id.botonact2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), Calculadora.class);
                startActivityForResult(intent2, 0);
            }
        });
    }
}
