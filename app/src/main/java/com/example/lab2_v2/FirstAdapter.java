package com.example.lab2_v2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class FirstAdapter extends BaseAdapter{

    ArrayList<String> list;
    Context context;

    public FirstAdapter(ArrayList<String> list, Context context) {
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


        // 1. Получили ссылку на объект Layout Inflater Service
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. С помощью метода inflate мы преобразовали xml-разметку
        // в контейнер View, который содержит внутри себя элементы из xml-разметки
        View view = inflater.inflate(R.layout.list_brand, parent, false);


        ImageView image = (ImageView) view.findViewById(R.id.item_image);
        TextView text = (TextView) view.findViewById(R.id.item_text);

        if(list.get(i).toLowerCase().equals("audi"))
        {
            image.setImageResource(R.drawable.audi);
        }
        else if(list.get(i).toLowerCase().equals("bmw"))
        {
            image.setImageResource(R.drawable.bmw);
        }
        else if(list.get(i).toLowerCase().equals("lada"))
        {
            image.setImageResource(R.drawable.lada);
        }
        else if(list.get(i).toLowerCase().equals("skoda"))
        {
            image.setImageResource(R.drawable.skoda);
        }
        else if(list.get(i).toLowerCase().equals("toyota"))
        {
            image.setImageResource(R.drawable.toyota);
        }


        text.setText(list.get(i));

        return view;
    }

}
