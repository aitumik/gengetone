package com.aitumik.nathanplayer.ui.fragments.base

import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.media.MediaBrowserCompat.MediaItem
import com.aitumik.nathanplayer.R
import com.aitumik.nathanplayer.ui.viewmodels.MainViewModel
import com.aitumik.nathanplayer.ui.viewmodels.SongDetailViewModel
import com.aitumik.nathanplayer.ui.viewmodels.SongViewModel
import com.aitumik.nathanplayer.utils.SettingsUtility
import com.skydoves.powermenu.PowerMenu
import org.koin.android.ext.android.inject


open class BaseFragment<T: MediaItem>: CoroutineFragment(){
    protected lateinit var dialog: AlertDialog
    protected val mainViewModel by inject<MainViewModel>()
    protected val songDetailViewModel by inject<SongDetailViewModel>()
    protected val powerMenu: PowerMenu? = null
    protected val settingsUtility by inject<SettingsUtility>()

    private lateinit var currentItemList: List<T>
    private lateinit var currentItem: T
    private var currentParentId = 0L
    private var alertPlayLists: AlertDialog? = null
    private val songViewModel by inject<SongViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    private fun init() {
    }

    private fun buildPlaylistMenu() {
    }


}
