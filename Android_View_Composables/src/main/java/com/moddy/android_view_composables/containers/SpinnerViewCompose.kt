package com.moddy.android_view_composables.containers

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun SpinnerViewCompose(
    modifier: Modifier = Modifier,
    config: (Spinner) -> Unit
) {
    AndroidView(factory = {
        Spinner(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}