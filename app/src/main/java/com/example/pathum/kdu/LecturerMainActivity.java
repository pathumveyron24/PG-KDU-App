package com.example.pathum.kdu;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class LecturerMainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView foc;
    public TextView foe;
    public TextView fom;
    public TextView fol;
    public TextView foma;
    public TextView fosh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_main);
        foc=(TextView)findViewById(R.id.foc);
        foc.setOnClickListener(this);
        foe=(TextView)findViewById(R.id.foe);
        foe.setOnClickListener(this);
        fol=(TextView)findViewById(R.id.fol);
        fol.setOnClickListener(this);
        fom=(TextView)findViewById(R.id.fom);
        fom.setOnClickListener(this);
        fosh=(TextView)findViewById(R.id.fosh);
        fosh.setOnClickListener(this);
        foma=(TextView)findViewById(R.id.foma);
        foma.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId() ==R.id.foc) {
            foc.setTypeface(null,Typeface.BOLD);
            startActivity(new Intent(getApplicationContext(), LecturerActivity.class));
        }
        //if(v.getId() ==R.id.foe){ startActivity(new Intent(getApplicationContext(), tt2.class));}
        //if(v.getId() ==R.id.fol){ startActivity(new Intent(getApplicationContext(), tt2.class));}
        //if(v.getId() ==R.id.fom) {startActivity(new Intent(getApplicationContext(), tt2.class));}
        //if(v.getId() ==R.id.fosh){ startActivity(new Intent(getApplicationContext(), tt2.class));}
        //if(v.getId() ==R.id.foma) {startActivity(new Intent(getApplicationContext(), tt2.class));

    }
}


