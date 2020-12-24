package com.aitumik.nathanplayer.ui.activities.base

import com.aitumik.nathanplayer.ui.activities.base.RequestPermissionActivity;
import android.os.Bundle
import com.aitumik.nathanplayer.utils.SettingsUtility
import com.skydoves.powermenu.PowerMenu
import org.koin.android.ext.android.inject

open class BaseActivity : RequestPermissionActivity() {

    private var currentTheme: String? = null
    private var powerMenu: PowerMenu? = null

    private val settingsUtility by inject<SettingsUtility>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun init() {
        currentTheme = settingsUtility.currentTheme
    }

    private fun setAppTheme(current_theme: String) {
        when(current_theme) {

        }
    }
}