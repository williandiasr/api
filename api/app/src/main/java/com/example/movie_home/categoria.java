package com.example.movie_home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class categoria extends AppCompatActivity {

    private ListView filmeView;
    private Adaptery adapter;

    private static final int LOADER = 1;
    private static final String TAG = "query";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        filmeView = findViewById(R.id.filmes);
        filmeView.setEmptyView(filmeView);

        adapter = new Adaptery(getApplicationContext());
        filmeView.setAdapter(adapter);
    }
}