package com.example.pathum.kdu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

//circle activity 
public class Circle1Activity extends AppCompatActivity {
    CircleMenu circleMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle1);
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.ic_account_balance_black_24dp, R.mipmap.icon_cancel);
        circleMenu.addSubMenu(Color.parseColor("#258CFF"), R.mipmap.al)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.eng)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.law)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.ma)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.com);


        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             Toast.makeText(Circle1Activity.this, "Faculty of Allied Health Sciences", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 1:
                                                             Toast.makeText(Circle1Activity.this, "Faculty of Engineering", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 2:
                                                             Toast.makeText(Circle1Activity.this, "Faculty of Management", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 3:
                                                             Toast.makeText(Circle1Activity.this, "Faculty of Law", Toast.LENGTH_SHORT).show();

                                                             break;
                                                         case 4:
                                                             Toast.makeText(Circle1Activity.this, "Faculty of Computing", Toast.LENGTH_SHORT).show();
                                                             startActivity(new Intent(Circle1Activity.this, LocationActivity.class));
                                                             break;
                                                     }
                                                 }
                                             }

        );

        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                                                     @Override
                                                     public void onMenuOpened() {

                                                     }

                                                     @Override
                                                     public void onMenuClosed() {

                                                     }
                                                 }
        );
    }

    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }
}



