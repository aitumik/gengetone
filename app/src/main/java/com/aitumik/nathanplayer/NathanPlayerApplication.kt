package com.aitumik.nathanplayer

import android.app.Application
import com.aitumik.nathanplayer.BuildConfig.DEBUG
import timber.log.Timber


class NathanPlayerApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        if(DEBUG) {
            //timber is a light weight logger for android
            Timber.plant(Timber.DebugTree());
        } else {
            Timber.d("prod");
        }
    }
}