package com.example.clase3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Isosceles extends AppCompatActivity {

    private EditText etNun1,etNun2,etNun3,etResultado;
    private RadioButton rbPerimetro,rbArea,rbDiagonal;
    private Button btnCalcular;
    private Spinner sp_figura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isosceles);
        Spinner spinner = (Spinner) findViewById(R.id.sp_figura);

        etNun1 = (EditText)findViewById(R.id.etNum1);
        etNun2 = (EditText)findViewById(R.id.etNum2);
        etNun3 = (EditText)findViewById(R.id.etNum3);
        etResultado = (EditText)findViewById(R.id.etResultado);

        rbPerimetro = (RadioButton)findViewById(R.id.rbPerimetro);
        rbArea = (RadioButton)findViewById(R.id.rbArea);
        rbDiagonal = (RadioButton)findViewById(R.id.rbDiagonal);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);

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
                    Intent myIntent = new Intent(spn.getContext(), Cuadrado.class);
                    startActivity(myIntent);
                }else if(posicion == 2){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Calculadora.class);
                    startActivity(myIntent);
                }else if(posicion == 3){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Circulo.class);
                    startActivity(myIntent);
                }else if(posicion == 4){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Triangulo.class);
                    startActivity(myIntent);
                }else if(posicion == 5){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Rombo.class);
                    startActivity(myIntent);
                }else if(posicion == 6){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Calculadora.class);
                    startActivity(myIntent);
                }else if(posicion == 7){
                    // Abre una nueva Activity:
                    Intent myIntent = new Intent(spn.getContext(), Calculadora.class);
                    startActivity(myIntent);
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });




        // Elementos en Spinner
        List<String> values = new ArrayList<String>();
        values.add("Selecione");
        values.add("Cuadrador");
        values.add("Rectangular");
        values.add("Circulo");
        values.add("Triangulo");
        values.add("Rombo");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, values);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);




        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNun1.getText().toString());
                int num2 = Integer.parseInt(etNun2.getText().toString());
                int num3 = Integer.parseInt(etNun3.getText().toString());


                double   perimetro,area,semi;

                semi =(num+num2+num3)/2;
                perimetro=num+num2+num3;

                area=(num+num2+num3)/2;
                double alturacampo1,alturacampo2,alturacampo3,area1,area2,area3;

                alturacampo1=2/num*Math.sqrt(area*(area-num)*(area-num2)*(area-num3));
                alturacampo2=2/num2*Math.sqrt(area*(area-num)*(area-num2)*(area-num3));
                alturacampo3=2/num3*Math.sqrt(area*(area-num)*(area-num2)*(area-num3));
                area1=(num*alturacampo1)/2;
                area2=(num2*alturacampo2)/2;
                area3=(num3*alturacampo3)/2;

                if(rbPerimetro.isChecked()== true){
                    etResultado.setText(""+ perimetro);
                    Context context = getApplicationContext();
                    CharSequence text = "Resultado Listo" ;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    Intent intent = new Intent(view.getContext(),Mostar.class);
                    //Export paremetro

                    intent.putExtra("frase",etResultado.getText().toString());
                    startActivityForResult(intent, 0);


                }if(rbArea.isChecked()== true){
                    etResultado.setText(""+ area1);etResultado.setText(""+ area2);etResultado.setText(""+ area3);


                    Context context = getApplicationContext();
                    CharSequence text = "Resultado Listo" ;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.LEFT|Gravity.LEFT, 0, 0);

                    toast.show();
                    Intent intent = new Intent(view.getContext(),Mostar.class);
                    //Export paremetro
                    intent.putExtra("Figura"," Equilatero");
                    intent.putExtra("frase",etResultado.getText().toString());
                    intent.putExtra("frase","Area= "+Double.toString(area1));
                    startActivityForResult(intent, 0);

                }if(rbDiagonal.isChecked()== true){
                    etResultado.setText("" + semi);

                    Context context = getApplicationContext();
                    CharSequence text = "Resultado Listo" ;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    Intent intent = new Intent(view.getContext(),Mostar.class);
                    //Export paremetro
                    intent.putExtra("frase"," Equilatero");
                    intent.putExtra("frase",etResultado.getText().toString());
                    startActivityForResult(intent, 0);


                }



            }
        });

        /*
        //CARGAMOS EL TEXTO A EXPORTAR
        final EditText etResu;
        etResu = (EditText)findViewById(R.id.etResul);

        Button btn = (Button) findViewById(R.id.btnPagi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Mostar.class);
                //Export paremetro
                intent.putExtra("frase",etResu.getText().toString());
                startActivityForResult(intent, 0);
            }
        });

*/
    }

}
