package com.aitumik.nathanplayer.repository

import android.content.ContentResolver
import android.content.Context
import android.database.Cursor
import com.aitumik.nathanplayer.models.Song

interface SongRepository {
    fun loadSongs(): List<Song>
    fun getSongs(): List<Song>
    fun getSongForId(id: Long): Song
    fun searchSongs(searchString: String,limit: Int): List<Song>
}

class SongsRepository(): SongRepository {

    private lateinit var contentResolver: ContentResolver

    companion object {
        private var instance: SongsRepository? = null

        fun getInstance(context: Context?): SongsRepository? {
            if(context == null) instance = SongsRepository(context)
            return instance
        }
    }

    constructor(context: Context?): this() {
        contentResolver = context!!.contentResolver
    }

    override fun loadSongs(): List<Song> {
        TODO("Implement it later")
    }

    override fun getSongs(): List<Song> {
        TODO("Not yet implemented")
    }

    override fun getSongForId(id: Long): Song {
        TODO("Not yet implemented")
    }

    override fun searchSongs(searchString: String, limit: Int): List<Song> {
        TODO("Not yet implemented")
    }

    private fun makeSongCursor(): Cursor? {
        TODO("LATER")
    }

    private fun makeSongCursor(selection: String?,paramArrayOfString: Array<String>?): Cursor? {
        TODO("TEST")
    }
}
