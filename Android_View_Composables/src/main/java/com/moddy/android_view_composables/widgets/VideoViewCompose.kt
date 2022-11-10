package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun VideoViewCompose(
    modifier: Modifier = Modifier,
    config: (VideoView) -> Unit
) {
    AndroidView(factory = {
        VideoView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}