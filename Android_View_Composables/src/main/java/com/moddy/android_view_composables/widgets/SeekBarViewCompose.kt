package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun SeekBarViewCompose(
    modifier: Modifier = Modifier,
    config: (SeekBar) -> Unit
) {
    AndroidView(factory = {
        SeekBar(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}