package com.aitumik.nathanplayer.db

import android.content.ContentValues
import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteConstraintException
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

open class DBHelper(context: Context?, factory: SQLiteDatabase.CursorFactory? = null):
        SQLiteOpenHelper(
            context,
            DATABASE_NAME,factory,
            DATABASE_VERSION
        ) {

            companion object {
                const val DATABASE_NAME = "com.aitumik.nathanplayer.db"
                const val DATABASE_VERSION = 1
            }
    protected open fun insertRow(
        tableName: String,
        columns: Array<String>,
        values: Array<String>
    ): Int {
        if(columns.size != values.size)
            throw SQLException("The column names size must be equal to values size")
        val contentValues = ContentValues()
        for((index,column) in columns.iterator().withIndex()) {
            contentValues.put(column,values[index]);
        }

        val db = this.writableDatabase
        return try {
            db.insert(tableName,null,contentValues).toInt()
        } catch (err: SQLException) {
            -1;
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }


}



