package com.example.cursework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

//The database is used to save the user data when they register
//And the source code is follow the practical 4b- Presistence with SQLite

public class Database extends AppCompatActivity {

    private static final String DATABASE_NAME = "mydatabase.db";
    private static int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "newtable";
    private static Context context;
    static SQLiteDatabase db;
    private SQLiteStatement insertStmt;

    private static final String INSERT = "insert into " + TABLE_NAME
            + " (name,email,password) values (?,?,?)";

    public Database(Context context) {
        Database.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);
        Database.db = openHelper.getWritableDatabase();
        this.insertStmt = Database.db.compileStatement(INSERT);
    }

    public long insert(String name, String email, String password) {
        this.insertStmt.bindString(1, name);
        this.insertStmt.bindString(2, email);
        this.insertStmt.bindString(3, password);
        return this.insertStmt.executeInsert();
    }

    public void deleteAll() {
        db.delete(TABLE_NAME, null, null);
    }

    public List<String[]> selectAll() {
        List<String[]> list = new ArrayList<String[]>();
        Cursor cursor = db.query(TABLE_NAME, new String[]{"id", "name", "email", "password"}, null, null, null, null, "name asc");
        int x = 0;
        if (cursor.moveToFirst()) {
            do {
                String[] b1 = new String[]{cursor.getString(0),
                        cursor.getString(1), cursor.getString(2),
                        cursor.getString(3)};
                list.add(b1);
                x++;
            } while (cursor.moveToNext());
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        cursor.close();
        return list;
    }

    private static class OpenHelper extends SQLiteOpenHelper {
        OpenHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE "
                    + TABLE_NAME
                    + " (id INTEGER PRIMARY KEY, name TEXT, email TEXT, password TEXT)");
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            DATABASE_VERSION = newVersion;
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
    }

}
