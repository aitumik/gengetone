package com.aitumik.nathanplayer.models

import android.database.Cursor
import android.support.v4.media.MediaBrowserCompat
import android.support.v4.media.MediaDescriptionCompat
import com.google.gson.Gson
import java.io.File

data class Song (
        val id: Long = -1,
        val albumId: Long = 0,
        val artistId: Long = 0,
        var title: String = "Title",
        var artist: String = "Artist",
        var album: String = "Album",
        val duration: Int = 0,
        val trackNumber: Int = 0,
        val path: String = "",
        var isFav: Boolean = false,
        var isSelected: Boolean = false,
        var playListId: Long = -1,
        var played: Boolean = false,
        ){
                companion object {
                        fun createFromCursor(cursor: Cursor,album_id: Long = 0): Song {
                                return Song(
                                        id = cursor.getLong(0),
                                        title = cursor.getString(1),
                                        artist = cursor.getString(2),
                                        album = cursor.getString(3),
                                        duration = cursor.getInt(4),
                                        trackNumber = cursor.getInt(5),
                                        artistId = cursor.getLong(6),
                                        albumId =  if(album_id == 0L) cursor.getLong(7) else album_id,
//                                        path = getSongUri(cursor.getLong(0)).toString()
                                )
                        }

                        fun createFromPlaylistCursor(cursor: Cursor): Song {
                                return Song(
                                        id = cursor.getLong(0),
                                        title = cursor.getString(1),
                                        artist = cursor.getString(2),
                                        album = cursor.getString(3),
                                        duration = cursor.getInt(4),
                                        trackNumber = cursor.getInt(5),
                                        artistId = cursor.getLong(6),
                                        albumId = cursor.getLong(7),
                                        playListId = cursor.getLong(8),
                                        path = getSongUri(cursor.getLong(0)).toString()
                                )
                        }

                        fun createFromFolderCursor(cursor: Cursor): Song {
                                return Song(
                                        id = cursor.getLong(0),
                                        title = cursor.getString(1),
                                        artist = cursor.getString(2),
                                        album = cursor.getString(3),
                                        duration = cursor.getInt(4),
                                        trackNumber = cursor.getInt(5),
                                        artistId = cursor.getLong(6),
                                        albumId = cursor.getLong(7),
                                        path = File(cursor.getString(8)).parent!!
                                )
                        }

                        fun createFromAudioFile(audioFile: AudioFile): Song {

                        }
                }

        fun toMediaItem() {
                TODO("finish creatng the song model and make sure it does not show the error")
        }

        override fun toString(): String {
                return Gson().toString()
        }

}
