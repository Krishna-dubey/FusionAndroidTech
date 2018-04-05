package com.example.krishna.fusionandroidtech;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    public  static android.support.v4.app.FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);



        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_container2)!=null && findViewById(R.id.fragment_container1)!=null){

            if(savedInstanceState!=null){
                return;

            }
            android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container2,new AboutUsFragment(),null);
            fragmentTransaction.add(R.id.fragment_container1,new AdvertismentFragment(),null);
            fragmentTransaction.commit();



        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.workshops:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container4,new WorkshopFragment(),null).commit();
                        return true;
                    case R.id.aw:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container4,new AwFragment(),null).commit();
                        return true;
                    case R.id.videos:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container4,new VideosFragment(),null).commit();
                        return true;
                    case R.id.more:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container4,new MoreFragment(),null).commit();
                        return true;
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1,new AdvertismentFragment(),null).commit();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,new AboutUsFragment(),null).commit();
                        return true;
                }
                return false;
            }
        });


    }



}
