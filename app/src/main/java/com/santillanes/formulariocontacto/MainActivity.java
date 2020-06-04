package com.santillanes.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {
    com.google.android.material.textfield.TextInputEditText nombre;
    DatePicker fecNac;
    com.google.android.material.textfield.TextInputEditText telefono;
    com.google.android.material.textfield.TextInputEditText email;
    com.google.android.material.textfield.TextInputEditText descripcion;
    String sNombre = "";
    String sFechaNac = "";
    String sTelefono = "";
    String sEmail = "";
    String sDescripcion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Bundle parametros = getIntent().getExtras();
        if (!parametros.isEmpty()) {
            sNombre = parametros.getString(getResources().getString(R.string.eNombre));
            sFechaNac = parametros.getString(getResources().getString(R.string.eFecNac));
            sTelefono = parametros.getString(getResources().getString(R.string.eTelefono));
            sEmail = parametros.getString(getResources().getString(R.string.eEmail));
            sDescripcion = parametros.getString(getResources().getString(R.string.eDescripcion));
        }
        */


        if (sNombre.equals("") && sFechaNac.equals("") && sTelefono.equals("") && sEmail.equals("") && sDescripcion.equals("")){
            nombre = findViewById(R.id.txtNombre);
            fecNac = findViewById(R.id.dpFecNac);
            telefono = findViewById(R.id.txtTelefono);
            email = findViewById(R.id.txtEmail);
            descripcion = findViewById(R.id.txtDescripcion);

            sNombre = nombre.getText().toString();
            sFechaNac = fecNac.getMonth()+"/"+fecNac.getDayOfMonth()+"/"+fecNac.getYear();
            sTelefono = telefono.getText().toString();
            sEmail = email.getText().toString();
            sDescripcion = descripcion.getText().toString();
        }

        // NO SE PUEDE OBTENER EL TEXTO INTRODUCIDO EN LOS EDIT TEXT
        System.out.println("====================================================    " +
                "nombre.getText() = "+sNombre);
        System.out.println("====================================================    " +
                "Fecha = "+sFechaNac);



    }

    public void siguiente(View v){

        Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        intent.putExtra(getResources().getString(R.string.eNombre), sNombre);
        intent.putExtra(getResources().getString(R.string.eFecNac), sFechaNac);
        intent.putExtra(getResources().getString(R.string.eTelefono), sTelefono);
        intent.putExtra(getResources().getString(R.string.eEmail), sEmail);
        intent.putExtra(getResources().getString(R.string.eDescripcion), sDescripcion);

        startActivity(intent);

    }
}
