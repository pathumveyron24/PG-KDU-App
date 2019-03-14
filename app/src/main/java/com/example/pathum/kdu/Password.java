package com.example.pathum.kdu;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.annotation.NonNull;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;


public class Password extends AppCompatActivity implements View.OnClickListener{
    private EditText edtEmail;
    private Button btnResetPassword;
    private TextView textViewback;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        edtEmail = (EditText) findViewById(R.id.editTextemail);
        btnResetPassword = (Button) findViewById(R.id.buttonreset);
        textViewback = (TextView) findViewById(R.id.textViewback);

        mAuth = FirebaseAuth.getInstance();
        textViewback.setOnClickListener(this);

        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edtEmail.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter your email!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Password.this, "Check email to reset your password!", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(Password.this, "Fail to send reset password email!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });


    }





    @Override
    public void onClick(View view) {


        if (view == textViewback) {
            startActivity(new Intent(this,LoginActivity.class));

        }}}


