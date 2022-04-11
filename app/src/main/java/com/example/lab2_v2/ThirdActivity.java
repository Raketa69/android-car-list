package com.example.lab2_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    String model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = this.getIntent();
        TextView textView2 = (TextView)  findViewById(R.id.textView2);
        model = intent.getStringExtra("model").toString();
        textView2.setText(model);
        ImageView imageView = (ImageView)  findViewById(R.id.imageView);

        if(model.equals("Skoda Octavia")) {
            imageView.setImageResource(R.drawable.octavia);
        }
        else if(model.equals("AUDI A7"))
        {
            imageView.setImageResource(R.drawable.a7);
        }
        else if(model.equals("BMW X5"))
        {
            imageView.setImageResource(R.drawable.x5);
        }
        else if(model.equals("LADA KALINA"))
        {
            imageView.setImageResource(R.drawable.kalina);
        }
        else if(model.equals("TOYOTA CAMRY"))
        {
            imageView.setImageResource(R.drawable.camry);
        }

    }
}