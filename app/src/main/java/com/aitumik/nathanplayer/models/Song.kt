package com.aitumik.nathanplayer.models

import android.database.Cursor
import android.media.browse.MediaBrowser.MediaItem

data class Song (
    val id: Long = -1,
    val albumId: Long = 0,
    val artisId: Long = 0,
    val title: String = "Title",
    val artist: String = "Artist",
    val album: String = "Album",
    val duration: Int = 0,
) {
    companion object {
        fun createFromCursor(cursor: Cursor,album_id: Long = 0): Song {
            return Song(
                id = cursor.getLong(0),
                title = cursor.getString(1),
                artist = cursor.getString(2),
                album = cursor.getString(3),
                duration = cursor.getInt(4),
            );
        }
    }
}
