package com.ackeesinga.secondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pagina2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
        Bundle bundle = getIntent().getExtras();
        String fraseimportada=bundle.getString("frase");

        String textoPasado = fraseimportada;
        TextView out = (TextView)findViewById(R.id.mostrar);
        out.setText(textoPasado);

    }


    /** asignar boton virtual al id*/


    public void controler2(View View) {

        Intent activity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(activity);

    }


}
