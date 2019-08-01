package com.example.myhouseholder2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FormaActivity extends AppCompatActivity {

    public static String txt;
    public static Boolean txt_visible = true;
    public static ArrayList countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma);

        ((TextView)findViewById(R.id.textView5)).setText(txt);
        if(!txt_visible)((TextView)findViewById(R.id.textView5)).setVisibility(View.GONE);

        // получаем элемент ListView
        ListView countriesList = (ListView) findViewById(R.id.list_item);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.select_dialog_singlechoice, countries);
        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    }
}
