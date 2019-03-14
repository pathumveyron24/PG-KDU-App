package com.example.pathum.kdu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView=itemView;
    }

    public void setDetails(Context ctx,String title,String description,String image,String email,String status){
        TextView mTitleTv=mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv=mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageIv=mView.findViewById(R.id.rImageView);
        TextView mEmailTv=mView.findViewById(R.id.rEmail);
        TextView mStatusTv=mView.findViewById(R.id.rStatus);

        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.with(ctx).load(image).into(mImageIv);
        mEmailTv.setText(email);
        mStatusTv.setText(status);
    }
}
