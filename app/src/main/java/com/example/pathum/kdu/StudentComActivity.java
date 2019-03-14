package com.example.pathum.kdu;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class StudentComActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_com);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Student/FOC-INTAKE34");
    }
    private void firebaseSearch(String searchText){
        Query firebaseSearchQuery=mRef.orderByChild("title").startAt(searchText).endAt(searchText + "\uf8ff");

        FirebaseRecyclerAdapter<StudentCom, Holder> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<StudentCom, Holder>(StudentCom.class,R.layout.row1,Holder.class,firebaseSearchQuery) {
            @Override
            protected void populateViewHolder(Holder holder, StudentCom model, int position) {
                holder.setDetailsAll(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage(),model.getEmail(),model.getPhone());
            }
        };
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<StudentCom, Holder> firebaseRecyclerAdapter= new FirebaseRecyclerAdapter<StudentCom, Holder>(StudentCom.class,R.layout.row1,Holder.class,mRef) {
            @Override
            protected void populateViewHolder(Holder holder, StudentCom model, int position) {
               holder.setDetailsAll(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage(),model.getEmail(),model.getPhone());
            }
        };
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                firebaseSearch(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                firebaseSearch(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
