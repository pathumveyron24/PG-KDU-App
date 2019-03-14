package com.example.pathum.kdu;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

public class Dashboard extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener, OnClickListener {
    SliderLayout sliderLayout;
    public ImageView el;
    public  ImageView caf;
    public ImageView  map;
    public ImageView student;
    public ImageView lecturer;
    public ImageView events;
    public ImageView contact;
    public ImageView ttable;
    public ImageView spo;

    HashMap<String,Integer> Hash_file_maps ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Hash_file_maps = new HashMap<>();




        map =(ImageView) findViewById(R.id.loc);
        el =(ImageView) findViewById(R.id.elibr) ;
        spo =(ImageView) findViewById(R.id.sports);
        caf =(ImageView) findViewById(R.id.cafe);
         student =(ImageView) findViewById(R.id.stu);
         lecturer =(ImageView) findViewById(R.id.lec) ;
        contact =(ImageView) findViewById(R.id.contac);
        events=(ImageView) findViewById(R.id.event);
        ttable=(ImageView) findViewById(R.id.time);


        caf.setOnClickListener(this);
        spo.setOnClickListener(this);
        el.setOnClickListener(this);
        map.setOnClickListener(this);
           student.setOnClickListener(this);
         lecturer.setOnClickListener(this);
        contact.setOnClickListener(this);
        events.setOnClickListener(this);
        ttable.setOnClickListener(this);

        sliderLayout = (SliderLayout)findViewById(R.id.slider);


        Hash_file_maps.put("For the Motherland Forever",R.drawable.image2);
        Hash_file_maps.put("Kotelawala Defence University",R.drawable.image3);

        Hash_file_maps.put("ARFRO Master Mind 2018",R.drawable.army);
        Hash_file_maps.put("General Convocation 2018",R.drawable.dew);
        Hash_file_maps.put("KDU Student Life",R.drawable.supun);


        for(String name : Hash_file_maps.keySet()){

            TextSliderView textSliderView = new TextSliderView(Dashboard.this);
            textSliderView
                    .description(name)
                    .image(Hash_file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);
            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(5000);
        sliderLayout.addOnPageChangeListener(this);
    }
    @Override
    protected void onStop() {

        sliderLayout.stopAutoCycle();

        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

        Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {

        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.elibr) {
            startActivity(new Intent(getApplicationContext(), Elibrary.class));
        }
        if (view.getId() == R.id.sports) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kduapp.000webhostapp.com/enrichment/en.html#contact"));
            startActivity(browserIntent);

            //WebView web =new WebView(this);
           // setContentView(web);
            //web.setWebViewClient(new WebViewClient());
            //WebSettings webSettings1=web.getSettings();
           // webSettings1.setJavaScriptEnabled(true);
           // web.loadUrl("https://kduapp.000webhostapp.com/enrichment/en.html#contact");

        }
        if (view.getId() == R.id.cafe) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kduapp.000webhostapp.com/cafenxt/cafe.php#menu"));
            startActivity(browserIntent);
            //WebView we =new WebView(this);
            //setContentView(we);
            //WebSettings webSettings=we.getSettings();
            //webSettings.setJavaScriptEnabled(true);
            //we.loadUrl("https://kduapp.000webhostapp.com/cafenxt/cafe.php#menu");


        }
        if (view.getId() == R.id.time) {
            startActivity(new Intent(getApplicationContext(), Circle2Activity.class));
        }

        if (view.getId() == R.id.event) {
            startActivity(new Intent(getApplicationContext(), EventActivity.class));
        }
        if (view.getId() == R.id.contac) {
            startActivity(new Intent(getApplicationContext(), Contact.class));
        }
        if (view.getId() == R.id.lec) {
            startActivity(new Intent(getApplicationContext(), LecturerMainActivity.class));
        }
        if (view.getId() == R.id.stu) {
            startActivity(new Intent(getApplicationContext(), StudentMainActivity.class));
        }
        if (view.getId()==R.id.loc){
            startActivity(new Intent(getApplicationContext(), Circle1Activity.class));
        }




    }

    public void onClickMethod(View view) {
        if (view.getId() == R.id.elibra) {
            startActivity(new Intent(getApplicationContext(), Elibrary.class));
        }
        if (view.getId() == R.id.sport) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kduapp.000webhostapp.com/enrichment/en.html"));
            startActivity(browserIntent);

            //WebView web =new WebView(this);
            // setContentView(web);
            //web.setWebViewClient(new WebViewClient());
            //WebSettings webSettings1=web.getSettings();
            // webSettings1.setJavaScriptEnabled(true);
            // web.loadUrl("https://kduapp.000webhostapp.com/enrichment/en.html#contact");

        }
        if (view.getId() == R.id.caf) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kduapp.000webhostapp.com/cafenxt/cafe.php"));
            startActivity(browserIntent);
            //WebView we =new WebView(this);
            //setContentView(we);
            //WebSettings webSettings=we.getSettings();
            //webSettings.setJavaScriptEnabled(true);
            //we.loadUrl("https://kduapp.000webhostapp.com/cafenxt/cafe.php#menu");


        }
        if (view.getId() == R.id.tt) {
            startActivity(new Intent(getApplicationContext(), Circle2Activity.class));
        }

        if (view.getId() == R.id.not) {
            startActivity(new Intent(getApplicationContext(), EventActivity.class));
        }
        if (view.getId() == R.id.cont) {
            startActivity(new Intent(getApplicationContext(), Contact.class));
        }
        if (view.getId() == R.id.lecs) {
            startActivity(new Intent(getApplicationContext(), LecturerMainActivity.class));
        }
        if (view.getId() == R.id.stud) {
            startActivity(new Intent(getApplicationContext(), StudentMainActivity.class));
        }
        if (view.getId()==R.id.loca){
            startActivity(new Intent(getApplicationContext(), Circle1Activity.class));
        }



    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}






