package com.aitumik.nathanplayer.repository

import android.content.Context
import com.aitumik.nathanplayer.models.Song

interface SongsRepository {
    fun loadSongs(): List<Song>
    fun getSongs(): List<Song>
    fun getSongForId(id: Long): Song
}
class SongsRepositoryImplementation(context: Context): SongsRepository {
    override fun loadSongs(): List<Song> {
        TODO("Not yet implemented")
    }

    override fun getSongs(): List<Song> {
        TODO("Not yet implemented")
    }

    override fun getSongForId(id: Long): Song {
        TODO("Not yet implemented")
    }

}