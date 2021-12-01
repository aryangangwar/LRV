package com.sujal.lrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declare Recyclerview , Adapter and ArrayList
    private RecyclerView recyclerView;
    private ScoutAdapter adapter;
    private ArrayList<Scout> scoutArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        // Initialize RecyclerView and set Adapter
        recyclerView = findViewById(R.id.scout_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        scoutArrayList = new ArrayList<>();
        adapter = new ScoutAdapter(this,scoutArrayList);
        recyclerView.setAdapter(adapter);
        createList();
    }

    private void createList() {
        //data to be shown in list
        scoutArrayList.add(new Scout( "Eren Jaeger" ,"123456789"));
        scoutArrayList.add(new Scout ( "Mikasa Ackermann" ,"123456789" ) );
        scoutArrayList.add(new Scout ( "Armin Arlelt" ,"123456789" ) );
        scoutArrayList.add(new Scout ( "Erwin Smith " , "123456789" ) );
        scoutArrayList.add(new Scout ( "Levi Ackermann" , "123456789"  ) );
        scoutArrayList.add(new Scout ( "Hange Zoe" , "123456789" ) );
        scoutArrayList.add(new Scout ( "Jean Kirschtein" , "123456789")	);
        scoutArrayList.add(new Scout ("Conny Springer", "123456789" )	);
        scoutArrayList.add(new Scout ("Sasha Bras","123456789")	);

    }
}