package com.aitumik.nathanplayer.ui.fragments.base

import androidx.fragment.app.Fragment
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import kotlin.coroutines.CoroutineContext

open class CoroutineFragment : Fragment() {
    protected val mainDispatcher: CoroutineDispatcher get() = Main

    private val job = Job()
    protected val scope = CoroutineScope(job + mainDispatcher)

    protected fun launch (
        context: CoroutineContext = mainDispatcher,
        start: CoroutineStart = CoroutineStart.DEFAULT,
        block: suspend CoroutineScope.() -> Unit
    ) = scope.launch(context,start,block)

    override fun onDestroyView() {
        job.cancel()
        super.onDestroyView()
    }
}

