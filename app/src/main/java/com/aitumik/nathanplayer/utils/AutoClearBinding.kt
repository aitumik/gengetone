package com.aitumik.nathanplayer.utils

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleObserver
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AutoClearBinding<T: Any>(fragment: Fragment): ReadWriteProperty<Fragment,T> {
    private var value : T? = null

    init {
        fragment.lifecycle.addObserver(object : LifecycleObserver {
            fun onDestroy() {
                value = null
            }
        })
    }

    override fun setValue(thisRef: Fragment, property: KProperty<*>, value: T) {
        TODO("Not yet implemented")
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        TODO("Not yet implemented")
    }
}