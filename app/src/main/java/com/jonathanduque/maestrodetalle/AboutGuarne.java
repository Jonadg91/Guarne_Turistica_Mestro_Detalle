package com.jonathanduque.maestrodetalle;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;//libreria de compatibilidad
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AboutGuarne extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about_guarne, container, false);
    }
}
