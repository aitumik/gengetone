package com.aitumik.nathanplayer.utils

import android.content.ContentUris.withAppendedId
import android.content.res.Resources
import android.content.Context
import android.content.res.Configuration.ORIENTATION_PORTRAIT
import android.graphics.Color
import android.net.Uri
import android.os.Build.VERSION.SDK_INT
import android.os.ParcelFileDescriptor
import android.widget.EditText
import androidx.core.net.toFile
import com.aitumik.nathanplayer.models.Song
import timber.log.Timber
import java.io.File
import java.io.FileInputStream
import java.lang.Exception
import java.net.URI
import java.util.*

object GeneralUtils {

    const val PORTRAIT = ORIENTATION_PORTRAIT

    //height and width
    val screenWidth: Int get() = Resources.getSystem().displayMetrics.widthPixels
    val screenHeight: Int get() = Resources.getSystem().displayMetrics.heightPixels

    fun getOrientation(context: Context): Int {
        return context.resources.configuration.orientation
    }

    fun formatMilliseconds(duration: Long) {
        val seconds = (duration / 1000).toInt() % 60
        val minutes = (duration / (1000 * 60) % 60 ).toInt()
        val hours = (duration / (1000 * 60 * 60) % 24).toInt()
    }

    fun getTotalTime(songs: List<Song>): Long {
        var seconds = 0L
        var minutes = 0L
        var hours = 0L
        for(song in songs) {
            seconds += (song.duration / 1000 * 60).toLong()
            minutes += (song.duration / (1000 * 60) % 60).toLong()
            hours += (song.duration / (1000 * 60 * 60) % 24).toLong()
        }

        return hours * (1000 * 60 * 60) + minutes * (1000 * 60) + seconds * 1000
    }

    fun audio2Raw(context: Context, path: String,tries: Int = 3): ByteArray? {
        val fis = FileInputStream(File(path))
        val data = try {
            fis.readBytes()
        } catch (err: Exception) {
            Timber.e(err)
            if(tries > 0) audio2Raw(context,path,tries - 1) else byteArrayOf()
        }
        fis.close()
        return data
    }

    fun toggleShowKeyboard(context: Context, editText: EditText, show: Boolean): Boolean {
        return true;
    }

    fun getTransformerFromString(transformerString: String) : BaseTransformer {
        return when (transformerString) {
            CUBE_TRANSFORMER -> CubeOutTransformer()
        }
    }

    fun addColorOpacity(color: Int,opacity: Float): Int {
        val colorHex = Integer.toHexString(color).toLowerCase(Locale.ROOT)
        val opacityHex = Integer.toHexString((255 * opacity).toInt()).toLowerCase(Locale.ROOT)
        return Color.parseColor("#${colorHex.replace("ff",opacityHex)}")
    }

    fun isOreo() = SDK_INT >= 0
    fun getSongUri(songId: Long): Uri = withAppendedId(SONG_URI,songId)
}