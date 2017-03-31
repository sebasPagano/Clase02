package com.example.alumno.segundoproyecto;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 30/03/2017.
 */



public class Vista implements IMostrarInfo {

    TextView tv;
    Button btn1;
    Button btn2;
    public Vista(Activity a, Modelo model )
    {
        tv = (TextView) a.findViewById(R.id.Hola);
        tv.setText(model.getTexto());

        btn1 = (Button) a.findViewById(R.id.Boton1);
        btn1.setText("Cualquier nombre");
        //View.OnClickListener listener = new MyListener(a);
        //btn1.setOnClickListener(listener);



    }
    public void mostrarInfo() {

        tv.setText("se cambia");
    }


}
