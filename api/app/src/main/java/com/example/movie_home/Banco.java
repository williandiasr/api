package com.example.movie_home;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper{
    public static final String ID = "id";
    public static final String TABELA = "usuario";
    public static final String NOME = "nomeUsu";
    public static final String LOGIN = "login";
    public static final String SENHA = "senha";
    public static final int VERSAO = 1;

    public Banco(Context context){
        super(context, NOME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL = "CREATE TABLE"+TABELA+"("
                + ID + " integer primary key autoincrement,"
                + NOME + " text,"
                + LOGIN + " text,"
                + SENHA + " text"
                +")";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }
}
