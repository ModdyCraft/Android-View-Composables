package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ImageViewCompose(
    modifier: Modifier = Modifier,
    config: (ImageView) -> Unit
) {
    AndroidView(factory = {
        ImageView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}