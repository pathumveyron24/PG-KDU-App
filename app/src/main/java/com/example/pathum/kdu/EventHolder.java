package com.example.pathum.kdu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class EventHolder extends RecyclerView.ViewHolder {

    View mView;
    public EventHolder(@NonNull View itemView) {
        super(itemView);
        mView=itemView;
    }

    public void setAll(Context ctx,String description ){
        TextView mDetailTv=mView.findViewById(R.id.rDescriptionTv);



        mDetailTv.setText(description);

    }
}
