package com.aitumik.nathanplayer.extensions

import android.app.Activity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.aitumik.nathanplayer.R

open class ActivityExtensions {

    fun Activity?.addFragment(
        @IdRes id: Int = R.id.main_container,
        fragment: Fragment,
        tag: String? = null,
        addToBackStack: Boolean = true,
        extras: Bundle? = null
        ) {
        val compatActivity = this as? AppCompatActivity ?: return
        if(extras != null) fragment.arguments = extras
        compatActivity.supportFragmentManager.beginTransaction()
            .apply {
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                add(id,fragment,tag)
                if(addToBackStack) addToBackStack(null)
                commit()
            }
    }

    fun Activity?.replaceFragment(
        @IdRes id: Int = R.id.main_container,
        fragment: Fragment,
        tag: String? = null,
        addToBackStack: Boolean = true
    ) {
        val compatActivity = this as? AppCompatActivity ?: return
        compatActivity.supportFragmentManager.beginTransaction()
            .apply {
                replace(id,fragment,tag)
                if(addToBackStack) {
                    addToBackStack(null)
                }
                commit()
            }
    }
}