package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ToggleButtonViewCompose(
    modifier: Modifier = Modifier,
    config: (ToggleButton) -> Unit
) {
    AndroidView(factory = {
        ToggleButton(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}