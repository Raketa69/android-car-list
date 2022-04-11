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
    ArrayList<String> skoda_list = new ArrayList<>();
    ArrayList<String> audi_list = new ArrayList<>();
    ArrayList<String> bmw_list = new ArrayList<>();
    ArrayList<String> lada_list = new ArrayList<>();
    ArrayList<String> toyota_list = new ArrayList<>();

    protected void createArrays() {
        list.add(0, "AUDI");
        list.add(1, "BMW");
        list.add(2, "SKODA");
        list.add(3, "LADA");
        list.add(4, "TOYOTA");

        skoda_list.add(0, "SKODA");
        skoda_list.add(1, "Skoda Octavia");

        audi_list.add(0, "AUDI");
        audi_list.add(1, "AUDI A7");

        bmw_list.add(0, "BMW");
        bmw_list.add(1, "BMW X5");

        lada_list.add(0, "LADA");
        lada_list.add(1, "LADA KALINA");

        toyota_list.add(0, "TOYOTA");
        toyota_list.add(1, "TOYOTA CAMRY");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        createArrays();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listView);
        final FirstAdapter adapter = new FirstAdapter(list, this);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(MainActivity.this, second_activity.class);
                if(position == 0) {
                    i.putExtra("list", audi_list);
                }
                else if(position == 1) {
                    i.putExtra("list", bmw_list);
                }
                else if(position == 2) {
                    i.putExtra("list", skoda_list);
                }
                else if(position == 3) {
                    i.putExtra("list", lada_list);
                }
                else if(position == 4) {
                    i.putExtra("list", toyota_list);
                }
                startActivity(i);
                MainActivity.this.onPause();
            }
        });

    }


}