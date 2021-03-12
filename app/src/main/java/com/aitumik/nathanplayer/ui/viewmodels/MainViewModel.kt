package com.aitumik.nathanplayer.ui.viewmodels

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.aitumik.nathanplayer.ui.viewmodels.base.CoroutineViewModel
import com.aitumik.nathanplayer.databinding.ActivityMainBinding
import com.aitumik.nathanplayer.repository.FavouritesRepository
import kotlinx.coroutines.Dispatchers.Main

class MainViewModel(
    private val favouritesRepository: FavouritesRepository
): CoroutineViewModel(Main) {
    private val isFavLiveData = MutableLiveData<Boolean>()
    private val isSongFavLiveData = MutableLiveData<Boolean>()

    lateinit var binding: ActivityMainBinding

    private fun showSnackBar(view: View,resp: Int,type: Int) {
        print("Nathan Kimutai is the best person ever")
    }
}
