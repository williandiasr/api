
package com.example.movie_home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.sql.Array;
import java.util.List;

public class Adaptery extends ArrayAdapter<Moviemodelclass> {

    public Adaptery (@NonNull Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
            if(view == null){
                view = LayoutInflater.from(getContext()).inflate(R.layout.activity_categoria, parent, false);
            }
            TextView Detalhes = view.findViewById(R.id.txtdetalhes);
            TextView Imagem = view.findViewById(R.id.imgfilme);

            Moviemodelclass currentRepository = getItem(position);

            Detalhes.setText(currentRepository.getDetalhes());
            Imagem.setText(currentRepository.getImagem());

        return view;
    }


}
