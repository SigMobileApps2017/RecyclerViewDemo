package com.cyberknight.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> names;
    ArrayList<String> description;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = new ArrayList<>();
        description = new ArrayList<>();

        names.add("Name 1");
        description.add("Student id: 1");
        names.add("Name 2");
        description.add("Student id: 2");
        names.add("Name 3");
        description.add("Student id: 3");
        names.add("Name 4");
        description.add("Student id: 4");
        names.add("Name 5");
        description.add("Student id: 5");
        names.add("Name 6");
        description.add("Student id: 6");
        names.add("Name 7");
        description.add("Student id: 7");
        names.add("Name 8");
        description.add("Student id: 8");

        recyclerView = (RecyclerView) findViewById(R.id.rvList);
        recyclerView.setLayoutManager(layoutManager);
        ListAdapter adapter = new ListAdapter(this,names,description);
        recyclerView.setAdapter(adapter);
    }
}
