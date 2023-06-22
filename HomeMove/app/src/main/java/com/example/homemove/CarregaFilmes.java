package com.example.homemove;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class CarregaFilmes extends AsyncTaskLoader<String> {
    private String mQueryString;
    CarregaFilmes(Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.buscaFilmes(mQueryString);
    }
}
