package com.nathanplayer.utils

import com.google.android.exoplayer2.C


class LoadController : LoadControl {
  var eventController: LoadEventController? = null
  
  override fun onPrepared() {
    eventController?.onPrepared()
  }
  
  override onTracksSelected (
    renderers: Array<Renderer>, trackGroupArray: TrackGroupArray,
    trackSelectionArray: TrackSelectionArray
  ) {}
  
  override fun onStopped() {}
  
  override fun onReleased() {}
  
  override fun getAllocator(): Allocator {
    return DefaultAllocator(true,20)
  }
  
  override fun getBufferDurationUs(): Long {
    return 0
  }
  
  override fun retainBackBufferFromKeyFrame(): Boolean {
    return true
  }
  
  override fun shouldContinueLoading(
    playbackPositionUs: Long,
    bufferedDurationUs: Long,
    playbackSpeed: Float
    ): Boolean {
      return true
  }
  
  override fun shouldStartPlayback(
    bufferedDurationUsL: Long, playbackSpeed: Float,
    rebuffering: Boolean
  ): Boolean {
    return true
  }
}
