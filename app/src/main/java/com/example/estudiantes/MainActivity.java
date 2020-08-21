package com.example.estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mate;
    private EditText espa;
    private EditText ing;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mate = (EditText)findViewById(R.id.Matematicas);
    espa = (EditText)findViewById(R.id.español);
    ing = (EditText)findViewById(R.id.ingles);
    res = (TextView)findViewById(R.id.Estatus);
    }
    public void calcular(View view){
    int m = Integer.valueOf(mate.getText().toString());
    int e = Integer.valueOf(espa.getText().toString());
    int i = Integer.valueOf(ing.getText().toString());
    int respuesta = (m+e+i)/3;
    if(respuesta < 6){
    res.setText("Reprobado");
    }else {
        res.setText("Aprobado");
    }
    //res.setText(String.valueOf(respuesta));
    }
}