package com.aitumik.nathanplayer.ui.activities.base

import android.content.Intent
import android.media.audiofx.AudioEffect
import com.aitumik.nathanplayer.ui.activities.base.RequestPermissionActivity;
import android.os.Bundle
import android.view.Gravity
import android.view.View
import com.aitumik.nathanplayer.R
import com.aitumik.nathanplayer.utils.SettingsUtility
import com.skydoves.powermenu.MenuAnimation
import com.skydoves.powermenu.OnMenuItemClickListener
import com.skydoves.powermenu.PowerMenu
import com.skydoves.powermenu.PowerMenuItem
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import timber.log.Timber

open class BaseActivity : RequestPermissionActivity() {

    private var currentTheme: String? = null
    private var powerMenu: PowerMenu? = null

    private val settingsUtility by inject<SettingsUtility>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val onMenuItemClickListener = OnMenuItemClickListener<PowerMenu>{ position, item ->
        when(position) {
            0 -> {
                val intent = Intent(AudioEffect.ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL)
                if(intent.resolveActivity(packageManager) != null) {
                    startActivityForResult(intent,2)
                } else {
                    Timber.e("there is no equalizer")
                }
            }
            1 -> {
                //open the settings activity
                Timber.e("Create a settings activity")
            }
        }
        powerMenu!!.dismiss()
    }

    private fun init() {
        currentTheme = settingsUtility.currentTheme
        powerMenu = initPopupMenu().setOnMenuItemClickListener(onMenuItemClickListener).build()
    }

    private fun setAppTheme(current_theme: String) {
        when(current_theme) {

        }
    }

    fun search(view: View) {
    }

    private fun initPopupMenu(): PowerMenu.Builder {
        return PowerMenu.Builder(this)
            .addItem(PowerMenuItem(getString(R.string.equalizer),false))
            .addItem(PowerMenuItem(getString(R.string.settings),false))
            .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT)
            .setMenuRadius(this.resources.getDimension(R.dimen.popupMenuRadius))
            .setMenuShadow(10f)
            .setShowBackground(false)
            .setTextGravity(Gravity.START)
            .setTextSize(16)
    }
}

