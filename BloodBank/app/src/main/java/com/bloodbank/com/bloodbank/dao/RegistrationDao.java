package com.bloodbank.com.bloodbank.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.bloodbank.model.Donor;

/**
 * Created by v2 on 9/21/2019.
 */

public class RegistrationDao extends SQLiteOpenHelper {
    public RegistrationDao(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Bank.db";
    private static final String TABLE_REGISTER= "donor";

    public static final String KEY_ID = "uId";
    public static final String KEY_NAME = " name";
    public static final String KEY_PHONE_NUM = "phNum";
    public static final String KEY_EMAIL_ID="email_id";
    public static final String KEY_PASSWORD = "pwd";
    public static final String KEY_REPASSWORD = "rePwd";
    public static final String KEY_BLOOD_GROUP = "bloodGroup";

    public static final String CREATE_TABLE="CREATE TABLE " + TABLE_REGISTER + "("
            + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"+KEY_PHONE_NUM + " TEXT,"+KEY_EMAIL_ID+ " TEXT,"
            + KEY_PASSWORD + " TEXT, " + KEY_REPASSWORD + " TEXT, " +KEY_BLOOD_GROUP + " TEXT " + ")";

    @Override
    public void onCreate(SQLiteDatabase db) {

            db.execSQL(CREATE_TABLE);
            // Database does not exist so copy it from assets here
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_REGISTER);
        onCreate(db);
    }
    public void addDetails(Donor donor){
        SQLiteDatabase  db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(KEY_ID,donor.getuId());
        values.put(KEY_NAME,donor.getName());
        values.put(KEY_PHONE_NUM,donor.getPhNum());
        values.put(KEY_EMAIL_ID,donor.geteMail());
        values.put(KEY_PASSWORD,donor.getPwd());
        values.put(KEY_REPASSWORD,donor.getRePwd());
        values.put(KEY_BLOOD_GROUP,donor.getBloodGroup());

        db.insert(TABLE_REGISTER,null,values);
        db.close();
    }
}