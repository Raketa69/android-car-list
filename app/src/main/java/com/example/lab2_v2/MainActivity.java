package com.example.lab2_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        list.add(0, "AUDI");
        list.add(1, "BMW");
        list.add(2, "SKODA");
        list.add(3, "LADA");
        list.add(4, "TOYOTA");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listView);
        final FirstAdapter adapter = new FirstAdapter(list, this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(MainActivity.this, second_activity.class);
                i.putExtra("brand", list.get(position));
                startActivity(i);
                MainActivity.this.onPause();
            }
        });

    }


}