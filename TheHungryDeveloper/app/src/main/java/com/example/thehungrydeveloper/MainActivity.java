package com.example.thehungrydeveloper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainsCard;

    CardView desertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterCard = findViewById(R.id.starter_card_View);
        mainsCard = findViewById(R.id.main_course_view);
        desertsCard = findViewById(R.id.desert_course_view);

        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // move to next screen
                Intent starterActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(starterActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity((mainActivityIntent));
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thehungrydeveloper@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        desertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desertActivityIntent = new Intent(MainActivity.this, DesertsActivity.class);
                startActivity(desertActivityIntent);
            }
        });
    }
}