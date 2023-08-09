package com.example.movie_home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

public abstract class categoria extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Moviemodelclass>>, android.app.LoaderManager.LoaderCallbacks<Moviemodelclass> {

    private ListView ListView;
    private EditText Tag;
    private TextView Error;
    private ProgressBar Loading;
    private Adaptery Adapter;

    private static final int LOADER = 1;
    private static final String TAG = "query";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        Loading = findViewById(R.id.Loading);
        Error = findViewById(R.id.Error);
        Tag = findViewById(R.id.Tag);

        ListView = findViewById(R.id.ListView);
        ListView.setEmptyView(Error);

        Adapter = new Adaptery(getApplicationContext());
        ListView.setAdapter(Adapter);

        if(savedInstanceState != null){
            String queryUrl = savedInstanceState.getString(TAG);
            Tag.setText(queryUrl);
        }

        getLoaderManager().initLoader(LOADER, null, this);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString(TAG, Tag.getText().toString().trim());
    }

    public Loader<List<Moviemodelclass>> onCreateLoader(int id, final Bundle args){
        return new AsyncTaskLoader<List<Moviemodelclass>>(this) {
            List<Moviemodelclass> RepertoryList;

            @Override
            protected void onStartLoading() {
                if (args == null) {
                    return;
                }
                Loading.setVisibility(View.VISIBLE);

                if (RepertoryList != null) {
                    deliverResult(RepertoryList);
                } else {
                    forceLoad();
                }
            }

            @Nullable
            @Override
            public List<Moviemodelclass> loadInBackground() {
                String SearchUrl = args.getString(TAG);

                try {
                    List<Moviemodelclass> SearchResult = NetworkUtils.getAPI(SearchUrl);
                    return SearchResult;
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            public void deliverResult(@Nullable List<Moviemodelclass> Json) {
                RepertoryList = Json;
                super.deliverResult(Json);
            }
        };
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Moviemodelclass>> loader, List<Moviemodelclass> data) {
        Loading.setVisibility(View.INVISIBLE);

        if(data == null){
            showErrorMessage();
        } else{
            Adapter.clear();
            Adapter.addAll(data);
            showDataView();
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Moviemodelclass>> loader) {

    }

    private void showDataView() {
        Error.setVisibility(View.INVISIBLE);
        ListView.setVisibility(View.VISIBLE);
    }

    private void showErrorMessage() {
        Error.setVisibility(View.VISIBLE);
        ListView.setVisibility(View.INVISIBLE);
    }

    public void search(View view){
        makeSearch();
    }

    private void makeSearch() {
        String Query = Tag.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString(TAG, Query);

        LoaderManager loader = getSupportLoaderManager();
        Loader searchLoader = loader.getLoader(LOADER);

        if(searchLoader == null){
            loader.initLoader(LOADER, bundle, this);
        } else{
            loader.restartLoader(LOADER, bundle, this);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}