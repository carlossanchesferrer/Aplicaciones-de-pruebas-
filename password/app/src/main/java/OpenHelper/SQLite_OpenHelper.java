package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by carlos on 2/26/2018.
 */

public class SQLite_OpenHelper extends SQLiteOpenHelper {


    public SQLite_OpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table usuarios(_ID integer primary key autoincrement," +
                "Nombre text,Distrito text,Correo text,Password text);";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    // Metodo para abrir la base de datos
    public void abrir(){

        this.getWritableDatabase();
    }


    // Metodo para cerrar la base de datos
    public void cerrar(){
        this.close();

    }

    //metodo que permite insertar registros en la tabla usuarios
    public void insertarReg(String nom,String Dis,String Cor,String pas ){
        ContentValues valores=new ContentValues();
        valores.put("Nombre",nom);
        valores.put("Distrito",Dis);
        valores.put("Correo",Cor);
        valores.put("Password",pas);
        this.getWritableDatabase().insert("usuarios",null,valores);


    }

    }



