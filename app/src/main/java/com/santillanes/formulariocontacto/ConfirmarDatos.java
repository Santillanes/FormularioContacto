package com.santillanes.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {
    String nombre;
    String fecNac;
    String telefono;
    String email;
    String descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();

        nombre = parametros.getString(getResources().getString(R.string.eNombre));
        fecNac = parametros.getString(getResources().getString(R.string.eFecNac));
        telefono = parametros.getString(getResources().getString(R.string.eTelefono));
        email = parametros.getString(getResources().getString(R.string.eEmail));
        descripcion = parametros.getString(getResources().getString(R.string.eDescripcion));

        TextView txtNombre = findViewById(R.id.txtNombreCD);
        TextView txtFecNac = findViewById(R.id.txtFecNacCD);
        TextView txtTelefono = findViewById(R.id.txtTelefonoCD);
        TextView txtEmail = findViewById(R.id.txtEmailCD);
        TextView txtDescripcion = findViewById(R.id.txtDescripcionCD);

        txtNombre.setText(nombre);
        txtFecNac.setText(fecNac);
        txtTelefono.setText(telefono);
        txtEmail.setText(email);
        txtDescripcion.setText(descripcion);

    }

    public void editarDatos(View v){
        System.out.println("Nombre = " + nombre);
        System.out.println("Fecha Nacimiento = "+ fecNac);
        System.out.println("Telefono = "+ telefono);
        System.out.println("Email = "+ email);
        System.out.println("Descripcion = "+ descripcion);

        Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
        intent.putExtra(getResources().getString(R.string.eNombre), nombre);
        intent.putExtra(getResources().getString(R.string.eFecNac), fecNac);
        intent.putExtra(getResources().getString(R.string.eTelefono), telefono);
        intent.putExtra(getResources().getString(R.string.eEmail), email);
        intent.putExtra(getResources().getString(R.string.eDescripcion), descripcion);

        startActivity(intent);
    }

}
