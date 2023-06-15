package com.example.movie_home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class categoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);


        private static List<Repository> jsonFormatter(String jsonResponse){
            List<Repository> repositoryList = new ArrayList<>();
            try{
                JSONObject json = new JSONObject(jsonResponse);
                JSONArray items = json.getJSONArray("items");
                //Get First 50 Repository
                int dataLen = 50;
                if(items.length() < dataLen){
                    dataLen = items.length();
                }
                for(int i = 0 ; i < dataLen ; i++){
                    JSONObject currentRepo = items.getJSONObject(i);
                    String repoName = currentRepo.getString("name");
                    String repoOwner = currentRepo.getJSONObject("owner").getString("login");
                    String repoLang = currentRepo.getString("language");
                    String repoStart = currentRepo.getString("stargazers_count");

                    Log.v("Data","Number " + i);
                    //Create Repository Object
                    Repository repository = new Repository(repoName,repoOwner,repoLang,repoStart);
                    //Add This Repository To List
                    repositoryList.add(repository);
                }
            }
            catch (JSONException ex){
                Log.v("Network","Can't Read Json");
            }
            return repositoryList;
        }


        public static List<Repository> getDataFromApi(String query) throws IOException {
            //First Create URL
            URL apiURL = buildUrl(query);
            String jsonResponse = getResponseFromHttpUrl(apiURL);
            List<Repository> repositoryList = jsonFormatter(jsonResponse);
            return repositoryList;
        }
    }
}