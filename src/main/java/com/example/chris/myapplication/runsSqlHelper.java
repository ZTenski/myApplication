package com.example.chris.myapplication;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

public class runsSqlHelper extends SQLiteOpenHelper
{
	public static final String DB_NAME= "runs";
	public static final int DB_VER = 1; 
	public static final String create = 
	"CREATE TABLE RUNS( runID INTEGER PRIMARY KEY, runCost FLOAT, runTip FLOAT, isCHarge BOOL )";
	public runsSqlHelper(Context con) {
		super(con, DB_NAME, null, DB_VER);
	}

	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(create);
	}
	
	public void onUpgrade(SQLiteDatabase dB, int old, int newV)
	{
		dB.execSQL("drop table runs");
		onCreate(dB);
	}

	@Override
	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		// TODO: Implement this method
		super.onDowngrade(db, oldVersion, newVersion);
	}
	
}
