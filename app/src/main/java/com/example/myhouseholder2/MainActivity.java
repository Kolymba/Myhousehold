package com.example.myhouseholder2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void click_btn(View v) {

        Button b = (Button) v;
        switch (b.getId()){

            case R.id.button1:
                //((TextView)findViewById(R.id.textView5)).setText("qwerrty");
                FormaActivity.txt = "Объявление от Управляющей компании";
                FormaActivity.txt_visible = true;
                FormaActivity.countries = new ArrayList();
                break;

            case R.id.button2:
                //((TextView)findViewById(R.id.textView5)).setVisibility(View.GONE);
                FormaActivity.txt_visible = false;
                FormaActivity.countries = new ArrayList();
                break;

            case R.id.button3:
                //((TextView)findViewById(R.id.textView5)).setText("qwerrty");
                FormaActivity.txt = "Если обнаружили дефект строительства мы передадим ваше сообщение застройщику";
                FormaActivity.txt_visible = true;
                //добавить заголовок к списку
                FormaActivity.countries = new ArrayList<String>(Arrays.asList("Стены", "Потолок", "Окна", "Водоснабжение", "Отопление", "Счетчик", "Другое"));
                break;

            case R.id. navigation_home:
                //((TextView)findViewById(R.id.textView5)).setText("qwerrty");
                FormaActivity.txt = "Если обнаружили дефект строительства мы передадим ваше сообщение застройщику";
                FormaActivity.txt_visible = true;
                //добавить заголовок к списку
                FormaActivity.countries = new ArrayList<String>(Arrays.asList("Стены", "Потолок", "Окна", "Водоснабжение", "Отопление", "Счетчик", "Другое"));
                break;


            default:
                FormaActivity.txt = "Wait!!!";
                FormaActivity.countries = new ArrayList();
                break;
        }

        Intent intent = new Intent(MainActivity.this, FormaActivity.class);
        startActivity(intent);
    }
}
