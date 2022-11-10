package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ButtonViewCompose(
    modifier: Modifier = Modifier,
    config: (Button) -> Unit
) {
    AndroidView(factory = {
        Button(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}