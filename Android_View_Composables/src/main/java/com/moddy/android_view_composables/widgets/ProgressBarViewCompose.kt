package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ProgressBarViewCompose(
    modifier: Modifier = Modifier,
    config: (ProgressBar) -> Unit
) {
    AndroidView(factory = {
        ProgressBar(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}