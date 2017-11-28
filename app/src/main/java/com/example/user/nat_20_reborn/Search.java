package com.example.user.nat_20_reborn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Search extends AppCompatActivity {
ListView SearchView;
    String [] searchInput = {"cake, potato, cheese"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        // widget storage
        SearchView = (ListView) findViewById(R.id.SearchView);
    }
}
