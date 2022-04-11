package com.example.lab2_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondAdapter extends BaseAdapter {

    ArrayList<String> list;
    Context context;

    public SecondAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. С помощью метода inflate мы преобразовали xml-разметку
        // в контейнер View, который содержит внутри себя элементы из xml-разметки
        View view = inflater.inflate(R.layout.list_model, parent, false);

        ImageView image = (ImageView) view.findViewById(R.id.item_image);
        TextView text = (TextView) view.findViewById(R.id.item_text);


        text.setText(list.get(i));
        if(list.get(i).equals("Skoda Octavia")) {
            image.setImageResource(R.drawable.octavia);
        }
        else if(list.get(i).equals("AUDI A7"))
        {
            image.setImageResource(R.drawable.a7);
        }
        else if(list.get(i).equals("BMW X5"))
        {
            image.setImageResource(R.drawable.x5);
        }
        else if(list.get(i).equals("LADA KALINA"))
        {
            image.setImageResource(R.drawable.kalina);
        }
        else if(list.get(i).equals("TOYOTA CAMRY"))
        {
            image.setImageResource(R.drawable.camry);
        }

        return view;
    }
}
