package com.example.chris.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.main_hub;
import layout.run_status;

public class MainActivity extends Activity {

    Fragment controlFrag;
    Fragment viewFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, main_interface.class);
                MainActivity.this.startActivity(myIntent);

            }
        });
    }
}

