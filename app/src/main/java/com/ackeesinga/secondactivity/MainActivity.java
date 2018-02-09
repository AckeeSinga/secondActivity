package com.ackeesinga.secondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // controlador();
    }

    /**asignar boton virtual al id*/
    public void controler(View View) {

        Intent activity = new Intent(getApplicationContext(), pagina2.class);
        startActivity(activity);
        final EditText textoexportar;
        textoexportar=(EditText) findViewById(R.id.intro);

        //Exportar parametro
        activity.putExtra("frase" , textoexportar.getText().toString());
        //
        startActivityForResult(activity,0);

    }

     /**le digo al boton que oiga el click
        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            Intent activity=new Intent(getApplicationContext(),pagina2.class);
            startActivity(activity);
            }

        });
    }*/

}
