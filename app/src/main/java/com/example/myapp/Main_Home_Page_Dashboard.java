package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Main_Home_Page_Dashboard extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    ImageView imageView1,imageView2,imageView3;

    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home_page_dashboard);

        Toolbar toolbar = findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.my_drawer_layout);
        NavigationView navigationView = findViewById(R.id.navdr);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(Main_Home_Page_Dashboard.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 int id = item.getItemId();

                    if (id == R.id.navmenu) {
                        Toast.makeText(getApplicationContext(), "HELOO", Toast.LENGTH_SHORT).show();
                        // Handle the camera action

                    } else if (id == R.id.navCart) {
                        Intent intent = new Intent(getApplicationContext(), Student_Leave_Form.class);
                        startActivity(intent);

                    } else if (id == R.id.holiday) {
                        Intent intent = new Intent(getApplicationContext(), Holiday1.class);
                        startActivity(intent);

                    } else if (id == R.id.navHistory) {
                        Intent intent = new Intent(getApplicationContext(), Student_History.class);
                        startActivity(intent);

                    } else if (id == R.id.navFeedback) {
                        Intent intent = new Intent(getApplicationContext(), My_Profile.class);
                        startActivity(intent);

                    } else if (id == R.id.navContact6) {
                        Intent intent = new Intent(getApplicationContext(), Help.class);
                        startActivity(intent);

                    } else if (id == R.id.navContact7) {
                        Intent intent = new Intent(getApplicationContext(), About_Page.class);
                        startActivity(intent);

                    } else if (id == R.id.navTerms) {
                        Toast.makeText(Main_Home_Page_Dashboard.this, "Share the Link", Toast.LENGTH_SHORT).show();

                    } else if (id == R.id.navShare) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }

                    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.my_drawer_layout);
                    drawer.closeDrawer(GravityCompat.START);
                    return true;
                }

        });


        imageView1 = findViewById(R.id.imageviewopen1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Home_Page_Dashboard.this, Student_Leave_Form.class);
                startActivity(intent);
            }
        });
        tv1 = findViewById(R.id.text1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Home_Page_Dashboard.this, Student_Leave_Form.class);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.imageviewopen2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Home_Page_Dashboard.this, Holiday1.class);
                startActivity(intent);
            }
        });
        tv2 = findViewById(R.id.text2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Home_Page_Dashboard.this, Holiday1.class);
                startActivity(intent);
            }
        });

        imageView3 = findViewById(R.id.imageviewopen3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Home_Page_Dashboard.this, Student_History.class);
                startActivity(intent);
            }
        });
        tv3 = findViewById(R.id.text3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Home_Page_Dashboard.this, Student_History.class);
                startActivity(intent);
            }
        });
    }
}