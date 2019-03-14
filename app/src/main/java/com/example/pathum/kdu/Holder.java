package com.example.pathum.kdu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Holder extends RecyclerView.ViewHolder {

    View mView;
    public Holder(@NonNull View itemView) {
        super(itemView);
        mView=itemView;
    }

    public void setDetailsAll(Context ctx, String title, String description, String image, String email, String phone ){
        TextView mTitleTv=mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv=mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageIv=mView.findViewById(R.id.rImageView);
        TextView mEmailOne=mView.findViewById(R.id.rEmail1);
        TextView mPhone=mView.findViewById(R.id.rPhone);

        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.with(ctx).load(image).into(mImageIv);
        mEmailOne.setText(email);
        mPhone.setText(phone);
    }
}
