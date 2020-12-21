package com.aitumik.nathanplayer.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aitumik.nathanplayer.models.Song
import com.aitumik.nathanplayer.repository.SongsRepository
import com.aitumik.nathanplayer.ui.viewmodels.base.CoroutineViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.withContext

class SongViewModel(private val songsRepository: SongsRepository): CoroutineViewModel(Main) {

    private val songsData = MutableLiveData<List<Song>>().apply { value = mutableListOf() }
    private val songsSelected = MutableLiveData<MutableList<Song>>().apply { value = mutableListOf() }

    fun update() {
        launch {
            val songs = withContext(IO) {
                songsRepository.loadSongs()
            }
            if (songs.isNotEmpty()) songsData
        }
    }

    fun update(song: MutableList<Song>) {
        songsSelected.postValue(song)
    }

    fun getSongList(): LiveData<List<Song>> {
        update()
        return songsData
    }

    fun selectedSongs(): LiveData<MutableList<Song>> {
        return songsSelected
    }

    fun delete(ids: LongArray): Int {
        //TODO implement the delete method in the songs repository
        return -1
    }

    fun getSongById(id: Long): Song {
        //TODO test stuff
        return Song()
    }


}