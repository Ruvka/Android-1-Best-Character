package com.example.tvseriesinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MySeriesData[] MySeriesData = new MySeriesData[]{
                new MySeriesData("MichaelScofield","Main Character",R.drawable.michaelscofield),
                new MySeriesData("FernandoSecre","Best friend of Michael Scofield",R.drawable.fernandosucre),
                new MySeriesData("Franklin","prisoner",R.drawable.franklin),
                new MySeriesData("LincolBorrows","Michael Sofield's brother",R.drawable.lincolborrows),
                new MySeriesData("Sara","Michael Scofield's GF",R.drawable.sara),
                new MySeriesData("Tbag","Prisoner",R.drawable.tbag),
                new MySeriesData("Bellick","Prison guard",R.drawable.bellick),
        };

        MySeriesAdapter MySeriesAdapter = new MySeriesAdapter(MySeriesData,  MainActivity.this);
        recyclerView.setAdapter(MySeriesAdapter);

    }
}