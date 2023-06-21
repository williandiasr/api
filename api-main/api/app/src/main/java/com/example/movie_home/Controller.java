package com.example.movie_home;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Controller {
    private SQLiteDatabase db;
    private Banco Banco;

    public Controller(Context context){
        Banco = new Banco(context);
    }

    public String insereDado(int id, String login, String senha){
        ContentValues addUso;
        long Adicionar;

        db = Banco.getWritableDatabase();
        addUso = new ContentValues();
        addUso.put(Banco.ID, id);
        addUso.put(Banco.LOGIN, login);
        addUso.put(Banco.SENHA, senha);

        Adicionar = db.insert(Banco.TABELA, null, addUso);
        db.close();

        if (Adicionar ==-1)
        {
            return "Erro ao inserir registro";
        }
        else
        {
            return "Registro Inserido com sucesso";
        }
    }

    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {Banco.ID, Banco.LOGIN};
        db = Banco.getReadableDatabase();
        cursor = db.query(Banco.TABELA, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    /* public Cursor carregaDadoById(int id){
        Cursor cursor;
        String[] campos =  {banco.ID,banco.TITULO,banco.AUTOR,banco.EDITORA};
        String where = BancoDeDados.ID + "=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query(BancoDeDados.TABELA,campos,where, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public void alteraRegistro(int id, String titulo, String autor, String editora){
        ContentValues valores;
        String where;

        db = banco.getWritableDatabase();

        where = BancoDeDados.ID + "=" + id;

        valores = new ContentValues();
        valores.put(BancoDeDados.TITULO, titulo);
        valores.put(BancoDeDados.AUTOR, autor);
        valores.put(BancoDeDados.EDITORA, editora);

        db.update(BancoDeDados.TABELA,valores,where,null);
        db.close();
    }

    public void deletaRegistro(int id){
        String where = BancoDeDados.ID + "=" + id;
        db = banco.getReadableDatabase();
        db.delete(BancoDeDados.TABELA,where,null);
        db.close();
    }
} */
}
