package com.example.honeysandroidprojects;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project gettingStartedWithProject = new Project("Getting", "This is description", 5);

        Project[] projects = {
                new Project("Getting", "This is description", R.drawable.ic_launcher_background),
                new Project("Vin", "This is description", R.drawable.ic_launcher_background),
                new Project("Getting", "This is description", R.drawable.ic_launcher_background),
                new Project("Getting", "This is description", R.drawable.ic_launcher_background),
                new Project("Getting", "This is description", R.drawable.ic_launcher_background),
        }

    }
}