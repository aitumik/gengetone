package com.aitumik.nathanplayer.ui.activities

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aitumik.nathanplayer.R
import com.aitumik.nathanplayer.ui.activities.base.BaseActivity
import com.aitumik.nathanplayer.ui.viewmodels.MainViewModel
import com.aitumik.nathanplayer.ui.viewmodels.SongDetailViewModel
import com.aitumik.nathanplayer.ui.viewmodels.SongViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val songViewModel by inject<SongViewModel>()
    private val songDetailViewModel by inject<SongDetailViewModel>()

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun init(savedInstanceState: Bundle?) {
        viewModel.binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        if(savedInstanceState == null) {
            replaceFragment()
        }
    }

    fun replaceFragment() {

    }
}