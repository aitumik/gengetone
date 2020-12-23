package com.aitumik.nathanplayer.models

import android.database.Cursor
import android.support.v4.media.MediaBrowserCompat
import com.google.gson.Gson

data class Album (
    var id: Long = 0,
    var title: String = "",
    var artist: String = "",
    var artistId: Long = 0,
    var songCount: Int = 0,
    var year: Int = 0
)  {
    companion object {
        fun createFromCursor(cursor: Cursor,artistId: Long = 0): Album {
            return Album(
                cursor.getLong(0),
                cursor.getString(1),
                cursor.getString(2),
            )
        }
    }

    override fun toString(): String {
        return Gson().toString()
    }

    fun toFavourite(): String {
       TODO("Create favourite model because its required here")
    }
}