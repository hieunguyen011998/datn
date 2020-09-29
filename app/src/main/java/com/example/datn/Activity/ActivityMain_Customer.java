package com.example.datn.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.datn.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ActivityMain_Customer extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView;
    public android.widget.SearchView searchMainDrink;
    public FrameLayout framMainContent;
    public ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__customer);
        setToolbar();
        addControls();
        addEvents();
    }
    public void setToolbar()
    {
         toolbar = getSupportActionBar();
         //toolbar.setBackgroundDrawable(null);
         toolbar.setTitle("Tin tức");
    }
    public void addControls()
    {
          bottomNavigationView = (BottomNavigationView) findViewById(R.id.ActivityMainCustomer_bottomNaviViewMenu);
          framMainContent = (FrameLayout) findViewById(R.id.ActivityMainCustomer_frameMainContent);
          searchMainDrink = (SearchView) findViewById(R.id.Activity_search);
    }
    public void addEvents()
    {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.bottomNavigation_News :
                        toolbar.setTitle("Tin tức");
                        break;
                    case R.id.bottomNavigation_Point :
                        toolbar.setTitle("Điểm thưởng");
                        break;
                    case R.id.bottomNavigation_Order :
                        toolbar.setTitle("Đặt hàng");
                        break;
                    case R.id.bottomNavigation_LoveDrink :
                        toolbar.setTitle("Yêu thích");
                        break;
                    case R.id.bottomNavigation_Account :
                        toolbar.setTitle("Tài khoản");
                        break;
                }
                return true;
            }
        });
    }
}