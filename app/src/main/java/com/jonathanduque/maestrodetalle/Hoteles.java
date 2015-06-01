package com.jonathanduque.maestrodetalle;

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;//libreria de compatibilidad
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Hoteles extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hoteles, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button bHotelSantamaria = (Button) getActivity().findViewById(R.id.bHotelSantamaria);
        Button bHotelLaCastellana = (Button) getActivity().findViewById(R.id.bHotelLaCastellana);
        Button bHotelElCacique = (Button) getActivity().findViewById(R.id.bHotelElCacique);

        bHotelSantamaria.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Hotel Santa Maria");
                builder.setMessage("Hotel que cuenta con hermosas habitaciones, Restaurante, " +
                        "Acceso a Wifi, Baño Privado con ducha, Dirección: calle 52 #52b 203");
                builder.setPositiveButton("OK", null);
                builder.create();
                builder.show();
            }
        });
        bHotelLaCastellana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Hotel La Castellana");
                builder.setMessage("Habitaciones Economicas, Dirección: Calle 52 # 52-14");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        });
        bHotelElCacique.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Hotel El Cacique ");
                builder.setMessage("Hotel Ubicado en el Parque Principal");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        });
    }
}
