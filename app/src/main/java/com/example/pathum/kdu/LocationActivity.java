package com.example.pathum.kdu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LocationActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Place/FOC");
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Location, LocationHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Location, LocationHolder>(Location.class,R.layout.row2,LocationHolder.class,mRef) {
            @Override
            protected void populateViewHolder(LocationHolder viewHolder, Location model, int position) {
                viewHolder.set(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage(),model.getLectureHall(),model.getStream());
            }
        };
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
