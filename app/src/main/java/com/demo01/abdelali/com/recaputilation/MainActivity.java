package com.demo01.abdelali.com.recaputilation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    EditText nombreAconv;
    TextView resultat;
    Button btnCon;
    RadioButton rBin,rOct,rHex,rRac;
    private void initialiser() {
        nombreAconv = findViewById(R.id.txtNbrD);
        resultat = findViewById(R.id.txtRes);
        btnCon = findViewById(R.id.btnConvertir);
        rBin = findViewById(R.id.rdbBin);
        rOct = findViewById(R.id.rdbOct);
        rHex = findViewById(R.id.rdbHex);
        rRac = findViewById(R.id.rdbRac);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiser();
        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nombreAconv.getText().toString().isEmpty()){
                    nombreAconv.setError("Vous devez saisir un nombre");
                }
                if(rBin.isChecked()){
                    resultat.setText( Integer.toBinaryString(Integer.parseInt(nombreAconv.getText().toString())));
                }else if (rHex.isChecked()){
                    resultat.setText( Integer.toHexString(Integer.parseInt(nombreAconv.getText().toString())));
                }else if (rOct.isChecked()){
                    resultat.setText( Integer.toOctalString(Integer.parseInt(nombreAconv.getText().toString())));
                }else if (rRac.isChecked()){
                    int x =Integer.parseInt(nombreAconv.getText().toString());
                    String racine = Double.toString(Math.sqrt(x));
                    resultat.setText(racine);
                }
            }
        });
    }




}
