package com.aitumik.nathanplayer.ui.fragments.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aitumik.nathanplayer.R
import com.aitumik.nathanplayer.models.Song
import com.aitumik.nathanplayer.ui.viewmodels.SongViewModel

class BaseSongDetailFragment : BaseFragment<Song>() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        showHideBottomSheet()
    }

    override fun onPause() {
        showHideBottomSheet()
        super.onPause()
    }

    override fun onResume() {
        showHideBottomSheet()
        super.onResume()
    }

    private fun showHideBottomSheet() {
        val currentData = SongViewModel.currentData.value ?: null
        if(currentData.id == 0L) return
        val fragment = requireActivity().supportFragmentManager

    }
}