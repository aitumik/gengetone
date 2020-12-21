package com.aitumik.nathanplayer.ui.activities.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class RequestPermissionActivity : AppCompatActivity() {

    companion object {
        private const val REQUEST_PERMISSIONS_CODE = 7444
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verify();
    }

    //function to verify permission
    private fun verify() {
        //TODO verify all the permissions here
    }

    private fun isReadStoragePermissionGranted(): Boolean {
        return true
    }

    private fun isWriteStoragePermissionGranted(): Boolean {
        return true;
    }


}