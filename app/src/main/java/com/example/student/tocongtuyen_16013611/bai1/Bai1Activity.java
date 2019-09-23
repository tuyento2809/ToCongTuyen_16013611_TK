package com.example.student.tocongtuyen_16013611.bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.student.tocongtuyen_16013611.R;

import java.util.ArrayList;

public class Bai1Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<Game> list;
    GameAdapter gameAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        listView = findViewById(R.id.lview);
        list = new ArrayList<>();
        list.add(new Game("Wolfverin",30000,"Amerian"));
        list.add(new Game("asdverin",20000,"Amerian"));
        list.add(new Game("Wgdfn",10000,"Amerian"));
        list.add(new Game("uijkgfgnerin",12000,"Amerian"));
        list.add(new Game("erdfverin",40000,"Amerian"));

        gameAdapter = new GameAdapter(this,R.layout.cell_listview,list);
        listView.setAdapter(gameAdapter);
    }
}
