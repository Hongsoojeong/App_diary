package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView=findViewById(R.id.recycler);
        button=findViewById(R.id.button);
        
        recyclerView.setOnClickListener(view->{
            
        });
        
        button.setOnClickListener(view->{
            
        });
    }
}