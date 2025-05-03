package com.example.myapplication4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        Button b1 = findViewById(R.id.button1);
        Button d1 = findViewById(R.id.button2);
        Button s1 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1_intent = new Intent(Intent.ACTION_VIEW);
                b1_intent.setData(Uri.parse("https://www.google.com"));
                startActivity(b1_intent);
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d1_intent = new Intent(Intent.ACTION_VIEW);
                d1_intent.setData(Uri.parse("tel:1212568947"));
                startActivity(d1_intent);
            }
        });

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1_intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(s1_intent);
            }
        });
    }
}
