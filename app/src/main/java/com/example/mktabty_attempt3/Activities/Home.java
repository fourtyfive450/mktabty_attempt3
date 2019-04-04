package com.example.mktabty_attempt3.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mktabty_attempt3.BackIDs;
import com.example.mktabty_attempt3.Fragments.FragmentBooksForFree;
import com.example.mktabty_attempt3.Fragments.FragmentBooksForSale;
import com.example.mktabty_attempt3.Fragments.FragmentBooksForSuber;
import com.example.mktabty_attempt3.Fragments.FragmentCatsMain;
import com.example.mktabty_attempt3.Fragments.FragmentCodeElt5fed;
import com.example.mktabty_attempt3.Fragments.FragmentComment;
import com.example.mktabty_attempt3.Fragments.FragmentFavo;
import com.example.mktabty_attempt3.Fragments.FragmentProfile;
import com.example.mktabty_attempt3.Fragments.FragmentProfileSettings;
import com.example.mktabty_attempt3.Fragments.FragmentSubscribeMF;
import com.example.mktabty_attempt3.Fragments.Fragment_code_sub;
import com.example.mktabty_attempt3.R;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawer;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,blogout;
    TextView share,follow,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Typeface face = Typeface.createFromAsset(getAssets(),"font1.otf");
        Typeface face1 = Typeface.createFromAsset(getAssets(),"font2.otf");
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b9= findViewById(R.id.b9);
        b10= findViewById(R.id.b10);
//        share=findViewById(R.id.share_with_frinds);
        follow=findViewById(R.id.follow);
        name=findViewById(R.id.name);
        name.setTypeface(face);

//        share.setTypeface(face);
        b1.setTypeface(face);
        b2.setTypeface(face);
        b3.setTypeface(face);
        b4.setTypeface(face);
        b5.setTypeface(face);
        b6.setTypeface(face);
        b5.setTypeface(face);
        b6.setTypeface(face);
        b7.setTypeface(face);
        b8.setTypeface(face);
        b9.setTypeface(face);
        b10.setTypeface(face);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        Initializing();
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        drawer.closeDrawer(GravityCompat.END);
        drawer.openDrawer(GravityCompat.END);
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
    }

    public void Initializing(){
        Fragment fragment = null;
        Class fragmentClass =  FragmentCatsMain.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }// Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
    }
    @Override
    public void onBackPressed() {
        //TODO el gravity elmfrod end msh start
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void ClickNavigation(View view){
        Intent i;
        Fragment fragment = null;
        Class fragmentClass =  FragmentCatsMain.class;

        switch (view.getId()){
            case R.id.b1:
                fragmentClass = FragmentCatsMain.class;
                break;
            case R.id.b2:
                fragmentClass = FragmentProfile.class;
                break;
            case R.id.b3:
                fragmentClass = FragmentFavo.class;
                break;
            case R.id.b4:
                fragmentClass=FragmentSubscribeMF.class;
//                fragmentClass = FragmentComment.class;
                break;
            case R.id.b5:
                fragmentClass = Fragment_code_sub.class;
                break;
            case R.id.b6:
                fragmentClass = FragmentCodeElt5fed.class;
                break;
            case R.id.b7:
                fragmentClass = FragmentProfileSettings.class;
                break;
            case R.id.b8:
                fragmentClass = FragmentBooksForSuber.class;
                break;
            case R.id.b9:
                fragmentClass = FragmentBooksForSale.class;
                break;
            case R.id.b10:
                fragmentClass = FragmentBooksForFree.class;
                break;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }// Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
    }




}
