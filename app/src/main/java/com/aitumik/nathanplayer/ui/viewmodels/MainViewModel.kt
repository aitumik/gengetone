package com.aitumik.nathanplayer.ui.viewmodels

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.aitumik.nathanplayer.ui.viewmodels.base.CoroutineViewModel
import kotlinx.coroutines.Dispatchers.Main

class MainViewModel(): CoroutineViewModel(Main) {
    private val isFavLiveData = MutableLiveData<Boolean>()
    private val isSongFavLiveData = MutableLiveData<Boolean>()


    private fun showSnackBar(view: View,resp: Int,type: Int) {
        print("Hello")
    }
}