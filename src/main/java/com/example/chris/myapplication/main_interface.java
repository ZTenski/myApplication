package com.example.chris.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;

import layout.add_run;
import layout.main_hub;
import layout.run_status;

public class main_interface extends Activity implements main_hub.OnFragmentInteractionListener, run_status.OnFragmentInteractionListener, add_run.OnFragmentInteractionListener{

    Fragment cf;

    Fragment sf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
        cf = main_hub.newInstance();
        getFragmentManager().beginTransaction().add(R.id.controlFrag, cf).commit();
        sf = run_status.newInstance();
        getFragmentManager().beginTransaction().add(R.id.statusFrag, sf).commit();
    }


    public void onRunAddButtonClicked() {
        getFragmentManager().beginTransaction().replace(R.id.controlFrag, add_run.newInstance()).commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
