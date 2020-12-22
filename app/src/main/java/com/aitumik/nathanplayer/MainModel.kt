package com.aitumik.nathanplayer

import android.content.ComponentName
import org.koin.dsl.module

val mainModel = module {
    single {
        val component = ComponentName(get(),NathanPlayerApplication::class.java)
    }
}