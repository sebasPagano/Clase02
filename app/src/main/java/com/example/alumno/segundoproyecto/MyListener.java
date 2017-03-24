package com.example.alumno.segundoproyecto;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View v)
    {

        if(v.getId()==R.id.Boton1)
        {
            Log.d("CLICK","se hizo click");
        }
        else
        {
            Log.d("CLICK","se hizo click en el boton2");
        }
    }
}
