package com.example.alumno.segundoproyecto;

/**
 * Created by alumno on 30/03/2017.
 */

public class Controlador {

    MyListener listener;
    public Controlador(MyListener listener)
    {
        this.listener = listener;

    }

    public MyListener getListener(){
        return this.listener;
    }

}
