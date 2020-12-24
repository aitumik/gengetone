package com.aitumik.nathanplayer.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aitumik.nathanplayer.repository.FavouritesRepository
import com.aitumik.nathanplayer.ui.viewmodels.base.CoroutineViewModel
import kotlinx.coroutines.Dispatchers.Main

class SongDetailViewModel(private val fav: FavouritesRepository): CoroutineViewModel(Main) {
    private val timeLiveData = MutableLiveData<Int>()
    val time: LiveData<Int> = timeLiveData

    private val lyrics: MutableLiveData<String> = MutableLiveData()

    fun getLyrics(): LiveData<String> {
        return lyrics
    }

    fun updateLyrics(lyric: String? = null) {
        lyrics.postValue(lyric)
    }

    override fun onCleared() {
        super.onCleared()
    }
}