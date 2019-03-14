package com.example.pathum.kdu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EventActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Event, EventHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Event, EventHolder>(Event.class,R.layout.row3,EventHolder.class,mRef) {
            @Override
            protected void populateViewHolder(EventHolder viewHolder, Event model, int position) {
                viewHolder.setAll(getApplicationContext(),model.getDescription());

            }
        };
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
