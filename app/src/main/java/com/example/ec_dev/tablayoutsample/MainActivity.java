package com.example.ec_dev.tablayoutsample;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener,
        PageFragment.OnFragmentInteractionListener,
        SettingsFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_pink_36dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_search_white_36dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_applications_white_36dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixcels) {
    }

    @Override
    public void onPageSelected(int position) {
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        switch(position) {
            case 0:
                tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_pink_36dp);
                tabLayout.getTabAt(1).setIcon(R.drawable.ic_search_white_36dp);
                tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_applications_white_36dp);
                break;
            case 1:
                tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_white_36dp);
                tabLayout.getTabAt(1).setIcon(R.drawable.ic_search_pink_36dp);
                tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_applications_white_36dp);
                break;
            case 2:
                tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_white_36dp);
                tabLayout.getTabAt(1).setIcon(R.drawable.ic_search_white_36dp);
                tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_applications_pink_36dp);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}
