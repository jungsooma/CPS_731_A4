package com.example.valorantagents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        
        s1 = getResources().getStringArray(R.array.agent_name);
        s2 = getResources().getStringArray(R.array.agent_description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2);
    }
}