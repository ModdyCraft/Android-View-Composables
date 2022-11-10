package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun SwitchViewCompose(
    modifier: Modifier = Modifier,
    config: (Switch) -> Unit
) {
    AndroidView(factory = {
        Switch(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}