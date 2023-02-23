package es.riberadeltajo.misharemybike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * @author Diego Pedraza Rafael de la Cruz
 * 2º DAM   PMDM    PRACTICA 3   SHARE MY BIKE
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin=findViewById(R.id.btnLogin);
        //AL PULSAR LOGIN, INICIA NUESTRA ACTIVIDAD
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), BikeActivity.class);
                startActivity(i);
            }
        });
    }
}