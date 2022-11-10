package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun RatingBarViewCompose(
    modifier: Modifier = Modifier,
    config: (RatingBar) -> Unit
) {
    AndroidView(factory = {
        RatingBar(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}