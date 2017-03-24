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
        TextView tv = (TextView) super.findViewById(R.id.Hola);
        tv.setText("XDXDXD");
        Button btn1 = (Button) findViewById(R.id.Boton1);
        btn1.setText("Cualquier nombre");

        View.OnClickListener listener = new MyListener();
        btn1.setOnClickListener(listener);



    }
}

