package com.aitumik.nathanplayer.models

import android.database.Cursor

class Favourite (
    var id: Long = -1,
    var title: String = "",
    var artist: String = "",
    var artistId: Long = -1,
    var year: Int = -1,
    var songCount: Int = -1,
    var type: String = ""
) {
    companion object {
        fun fromCursor(cursor: Cursor): Favourite {
            return Favourite(
                cursor.getLong(0),
                cursor.getString(1),
                cursor.getString(2),
                cursor.getLong(3),
                cursor.getInt(4),
                cursor.getInt(5),
                cursor.getString(6)
            )
        }
    }

    fun columnNames(): Array<String> {
        return arrayOf( )
    }
}
