package com.example.gridviewwithcustomadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] gridText = {
            "Camera", "Camera Roll", "Featured", "My Videos", "Likes", "Watch Later", "Stats", "Subscriptions", "Help"
    };

    int[] gridImages = {
            R.drawable.camera, R.drawable.film, R.drawable.tv,
            R.drawable.playbutton, R.drawable.like, R.drawable.clock,
            R.drawable.stats, R.drawable.check, R.drawable.question_mark
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        CustomGridAdapter adapter = new CustomGridAdapter(MainActivity.this, gridText, gridImages);
        gridView.setAdapter(adapter);
    }
}