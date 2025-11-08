package com.example.test_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SelectListener {

    RecyclerView recyclerView;
    ArrayList<MyModel> items;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items = new ArrayList<>();
        items.add(new MyModel("Trương Đức Huy"));
        items.add(new MyModel("Msv: 23115053122315"));
        items.add(new MyModel("Lớp: 23T3"));
        items.add(new MyModel("Môn học: Lập trình di động"));

        adapter = new CustomAdapter(this, items, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this, "Clicked: " + myModel.getTitle(), Toast.LENGTH_SHORT).show();
    }
}
