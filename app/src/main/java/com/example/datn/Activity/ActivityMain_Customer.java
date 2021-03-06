package com.example.datn.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.datn.Adapter.DrinkAdapter;
import com.example.datn.Fagment.Fragment_Account;
import com.example.datn.Fagment.Fragment_LoveDrink;
import com.example.datn.Fagment.Fragment_News;
import com.example.datn.Fagment.Fragment_Order;
import com.example.datn.Fagment.Fragment_Point;
import com.example.datn.Object.Drink;
import com.example.datn.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ActivityMain_Customer extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout framMainContent;
    private ActionBar toolbar;
    private TextView txtTittleSuaChua;
    private RecyclerView recyclerSuaChua;
    private ArrayList<Drink> listDrink;
    private DrinkAdapter drinkAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__customer);
        initData();
        addControls();
     //   initListDrink();
        addEvents();
    }
    public void initListDrink()
    {
        String dateCreateDrink;
        Calendar calen = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        dateCreateDrink = "" + simpleDateFormat.format(calen.getTime());
        listDrink = new ArrayList<Drink>();
        listDrink.add(new Drink(1,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(2,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(3,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(4,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(5,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(6,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(7,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(8,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        listDrink.add(new Drink(9,"Sữa chua xoài",R.drawable.suachuaxoai,1,20000,"Sữa chua",dateCreateDrink));
        recyclerSuaChua.setHasFixedSize(true);
        recyclerSuaChua.setLayoutManager(new GridLayoutManager(this,2));
        drinkAdapter = new DrinkAdapter(listDrink);
        recyclerSuaChua.setAdapter(drinkAdapter);
    }
    public void initData()
    {
        // MainStartService();
//        getSupportActionBar().setTitle("Thông tin");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ActivityMainCustomer_frameMainContent,new Fragment_News(),"frgNews")
                .addToBackStack(null)
                .commit();

    }
    public void addControls()
    {
          bottomNavigationView = (BottomNavigationView) findViewById(R.id.ActivityMainCustomer_bottomNaviViewMenu);
          framMainContent = (FrameLayout) findViewById(R.id.ActivityMainCustomer_frameMainContent);
//          txtTittleSuaChua = (TextView) findViewById(R.id.id_ActivityMainCustomer_txtTittleSuaChua);
//          recyclerSuaChua = (RecyclerView) findViewById(R.id.ActivityMainCustomer_RecycleSuaChua);
    }
    public void addEvents()
    {
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }
    public BottomNavigationView.OnNavigationItemSelectedListener navListener;
    {
        navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.bottomNavigation_News:
                      //  getSupportActionBar().setTitle("Tin tức");
                        selectedFragment = new Fragment_News();
                        loadFragment(selectedFragment, "frgNews");
                        return true;
                    case R.id.bottomNavigation_Point:
                      //  getSupportActionBar().setTitle("Điểm thưởng");
                        selectedFragment = new Fragment_Point();
                        loadFragment(selectedFragment, "frgPoint");
                        return true;
                    case R.id.bottomNavigation_Order:
                       // getSupportActionBar().setTitle("Menu");
                        selectedFragment = new Fragment_Order();
                        loadFragment(selectedFragment, "frgOrder");
                        return true;
                    case R.id.bottomNavigation_LoveDrink:
                        //getSupportActionBar().setTitle("Yêu thích");
                        selectedFragment = new Fragment_LoveDrink();
                        loadFragment(selectedFragment, "frgLoveDrink");
                        return true;
                    case R.id.bottomNavigation_Account :
                        //getSupportActionBar().setTitle("Tài khoản");
                        selectedFragment = new Fragment_Account();
                        loadFragment(selectedFragment, "frgAccount");
                        return true;
                }
                return true;
            }
        };
    }
    private void loadFragment(Fragment a, String nameFragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ActivityMainCustomer_frameMainContent,a,nameFragment)
                .addToBackStack(null)
                .commit();
    }
}