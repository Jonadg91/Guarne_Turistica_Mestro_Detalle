package com.jonathanduque.maestrodetalle;

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class Bares extends Fragment {
    //@Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bares, container, false);
    }

    @Override
    //metodo que pertenece al ciclo de vida del fragment
    public void onStart() {
        super.onStart();
        Button bCupulaBar= (Button) getActivity().findViewById(R.id.bCupulaBar);
        Button bBarraBar= (Button) getActivity().findViewById(R.id.bBarraBar);
        Button bFondaMezcel= (Button) getActivity().findViewById(R.id.bFondaMezcal);
        Button bGotchaBar= (Button) getActivity().findViewById(R.id.bGotchaBar);

        bCupulaBar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("La Cupula Bar Cafe");
                builder.setMessage("Licores nacionales y Productos Varios\n" +
                        "\nOfrece la mejor rumba crossover, ubicada en el centro de comercio");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        });

        bBarraBar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Barra Bar");
                builder.setMessage("Variedad de Licores Nacionales.\n" +
                        "\n" +"Barra Bar ofrece un lugar para el disfrute del buen Rock, ubicado en la Zona Rosa");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        });

        bFondaMezcel.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Fonda Mezcal");
                builder.setMessage("Licores nacionales\n" +
                        "\n" + "Mezcal ofrece la mejor rumba crossover con artistas de gran nivel, ubicada en la Zona Rosa");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        });

        bGotchaBar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Licorera Bar Gotcha");
                builder.setMessage("Licores nacionales e importados.\n" +
                        "\n" +"GOTCHA ofrece la mejor rumba crossover, ubicado en la Zona Rosa");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        });

    }
}
