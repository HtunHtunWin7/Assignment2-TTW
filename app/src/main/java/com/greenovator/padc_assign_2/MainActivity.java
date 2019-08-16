package com.greenovator.padc_assign_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.greenovator.padc_assign_2.activity.DetailActivity;
import com.greenovator.padc_assign_2.adapters.ItemListAdapter;
import com.greenovator.padc_assign_2.delegates.ItemDelegate;

public class MainActivity extends AppCompatActivity implements ItemDelegate {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        ItemListAdapter adapter = new ItemListAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onTapItem() {
        startActivity(new Intent(this, DetailActivity.class));
    }
}
