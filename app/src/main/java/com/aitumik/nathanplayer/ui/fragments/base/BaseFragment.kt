package com.aitumik.nathanplayer.ui.fragments.base

import android.app.AlertDialog
import android.support.v4.media.MediaBrowserCompat.MediaItem

open class BaseFragment<T : MediaItem> {

    protected lateinit var dialog: AlertDialog
    protected varl powerMenu: PowerMenu? = null

    private fun init() {
        powerMenu =
    }
}

