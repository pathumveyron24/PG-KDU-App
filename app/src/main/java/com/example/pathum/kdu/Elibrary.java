package com.example.pathum.kdu;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;


public class Elibrary extends AppCompatActivity implements View.OnClickListener{
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elibrary);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);


        button1.setOnClickListener( this);

        button2.setOnClickListener( this);
        button3.setOnClickListener( this);
        button4.setOnClickListener( this);
        button5.setOnClickListener( this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1){

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1iohSQsPI8_zYmCTp56Gy55rDhq1KOo-K?usp=sharing"));
            startActivity(browserIntent);
        }
        if (v.getId() == R.id.button2){

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1VdabDs5YX9ISvwtVRKHCJlXnjphozT25?usp=sharing"));
            startActivity(browserIntent);
        }
        if (v.getId() == R.id.button3){

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1jMjNommoholCQWykuT9oDoSqOm4nZlp5?usp=sharing"));
            startActivity(browserIntent);
        }
        if (v.getId() == R.id.button4){

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kdu.ac.lk/library/"));
            startActivity(browserIntent);

        }
        if (v.getId() == R.id.button5){

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://lms.kdu.ac.lk/lms/"));
            startActivity(browserIntent);

        }


    }}










