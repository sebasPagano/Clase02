package com.example.alumno.segundoproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//genera todas las instancias de las view


        Modelo model = new Modelo("otro texto");
        Vista vista = new Vista(this,model);
        Controlador controlador = new Controlador(new MyListener(vista));
        /*TextView tv = (TextView) super.findViewById(R.id.Hola);
        tv.setText(textos);

        Button btn1 = (Button) findViewById(R.id.Boton1);
        btn1.setText("Cualquier nombre");

        View.OnClickListener listener = new MyListener(this);
        btn1.setOnClickListener(listener);


        Button btn2 = (Button) findViewById(R.id.Boton2);
        btn2.setOnClickListener(listener);
*/

    }

   /* public void mostrarInfo() {
        TextView tev = (TextView) super.findViewById(R.id.Hola);
        tev.setText("se cambia");
    }*/
}

