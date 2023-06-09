package com.example.movie_home;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NetworkUtils {

    // 1 - link do json na internet https://run.mocky.io/v3/e4f1c2d7-eb2c-45cb-9466-e2349fc1bc24

    private static String JSON_URL = "https://run.mocky.io/v3/e4f1c2d7-eb2c-45cb-9466-e2349fc1bc24";

    private static URL API(String api){
        Uri uri= Uri.parse(JSON_URL).buildUpon().build();

        URL url = null;
        try {
            url = new URL(uri.toString());
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return url;
    }

    private static String getHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if(hasInput){
                return scanner.next();
            } else {
                return null;
            }
        }
        finally{
            urlConnection .disconnect();
        }
    }

    private static List<Moviemodelclass> jsonFromatter(String jsonResponse){
        List<Moviemodelclass> repositoryList = new ArrayList<>();
        try {
            JSONObject json = new JSONObject(jsonResponse);
            JSONArray item = json.getJSONArray("itens");

            int dataLen = 50;
            if(item.length() < dataLen){
                dataLen = item.length();
            }
            for(int i = 0; i < dataLen; i++){
                JSONObject currentRepo = item.getJSONObject(i);
                String Detalhes = currentRepo.getString("Detalhes");
                String Imagem = currentRepo.getString("Imagem");

                Log.v("Data", "Número" + 1);

                Moviemodelclass objeto = new Moviemodelclass(Detalhes, Imagem);

                repositoryList.add(objeto);
            }
        } catch (JSONException ex){
            Log.v("Network", "Network");
        }
        return repositoryList;
    }

    public static List<Moviemodelclass> getAPI(String query) throws IOException{
        URL apiUrl = API(query);
        String jsonResponse = getHttpUrl(apiUrl);
        List<Moviemodelclass> repositoryList = jsonFromatter(jsonResponse);

        return repositoryList;
    }
}
