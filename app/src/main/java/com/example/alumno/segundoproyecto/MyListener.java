package com.example.alumno.segundoproyecto;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {


    private IMostrarInfo iMostrarInfo;
    public MyListener(IMostrarInfo iMostrarInfo)
    {
        this.iMostrarInfo = iMostrarInfo;
       // this.activity = a;
    }

    @Override
    public void onClick(View v)
    {
      /*  TextView tv = (TextView) activity.findViewById(R.id.Boton2);
        tv.setText("se cambia");
        Log.d("CLICK","se hizo click");*/
        iMostrarInfo.mostrarInfo();

      /*  if(v.getId()==R.id.Boton1)
        {
            Log.d("CLICK","se hizo click");
        }
        else
        {
            Log.d("CLICK","se hizo click en el boton2");

        }*/
    }
    /*
       public void onClick(View v)
       {

       }

    */


}
