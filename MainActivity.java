package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        adapter.add("楊自強 醫師");
        adapter.add("彭光萍 醫師");
        adapter.add("魏銓儀 醫師");
        adapter.add("林連福 醫師");
        adapter.add("黎瓊珠 醫師");
        adapter.add("白美安 醫師");
        adapter.add("黃清順 醫師");

        listView.setAdapter(adapter);
    }

}