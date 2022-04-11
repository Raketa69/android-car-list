package com.example.lab2_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class second_activity extends AppCompatActivity {
    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView_model = (TextView) findViewById(R.id.textView_model);
        Intent intent = this.getIntent();
        if (intent != null)
        {
            list = intent.getStringArrayListExtra("list");
            textView_model.setText(list.get(0));
            list.remove(0);
        }


        final ListView listView_model = (ListView) findViewById(R.id.listView_model);
        final SecondAdapter adapter = new SecondAdapter(list, this);
        listView_model.setAdapter(adapter);

        listView_model.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(second_activity.this, ThirdActivity.class);

               i.putExtra("model", list.get(position));
                startActivity(i);
                second_activity.this.onPause();
            }
        });



    }
}