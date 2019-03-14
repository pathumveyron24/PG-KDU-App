package com.example.pathum.kdu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    int[] IMAGES ={R.drawable.ic_contact_phone_black_24dp,R.drawable.ic_contact_phone_black_24dp,R.drawable.ic_contact_phone_black_24dp,R.drawable.ic_contact_phone_black_24dp,R.drawable.ic_contact_phone_black_24dp,R.drawable.ic_contact_phone_black_24dp,R.drawable.ic_contact_phone_black_24dp};
    String[] NAMES={"Vice Chancellor","Deputy Vice Chancellor(Defence)","Deputy vice Chancellor(Academic)","Dean,Faculty of Defence Studies","Adjutant","Registrar","Bursar"};
    String[] DESCRIPTIONS ={"+94-11-2634274","+94-11-2632027","+94-11-2635201","+94-11-2622503","+94-11-2635202","+94-11-2622502","+94-11-2622601"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);




        ListView listView=(ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

    }






    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customerlayout,null);
            ImageView imageView=(ImageView) convertView.findViewById(R.id.imageView);
            TextView textView_name=(TextView) convertView.findViewById(R.id.textView_name);
            TextView textView_description=(TextView) convertView.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_description.setText(DESCRIPTIONS[position]);

            return convertView ;




        }


    }}
