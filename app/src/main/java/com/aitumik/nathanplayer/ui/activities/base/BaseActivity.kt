package com.aitumik.nathanplayer.ui.activities.base

import com.aitumik.nathanplayer.ui.activities.base.RequestPermissionActivity;
import android.os.Bundle

class BaseActivity : RequestPermissionActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}