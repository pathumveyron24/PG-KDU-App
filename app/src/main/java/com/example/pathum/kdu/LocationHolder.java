package com.example.pathum.kdu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class LocationHolder extends RecyclerView.ViewHolder {

    View mView;
    public LocationHolder(@NonNull View itemView) {
        super(itemView);
        mView=itemView;
    }

    public void set(Context ctx,String title,String description,String image,String lectureHall,String stream){
        TextView mTitleTv=mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv=mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageIv=mView.findViewById(R.id.rImageView);
        TextView mLectureHallTv=mView.findViewById(R.id.rLectureHall);
        TextView mStreamTv=mView.findViewById(R.id.rStream);

        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.with(ctx).load(image).into(mImageIv);
        mLectureHallTv.setText(lectureHall);
        mStreamTv.setText(stream);
    }
}
