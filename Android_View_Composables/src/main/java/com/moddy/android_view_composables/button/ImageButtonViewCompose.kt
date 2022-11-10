package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ImageButtonViewCompose(
    modifier: Modifier = Modifier,
    config: (ImageButton) -> Unit
) {
    AndroidView(factory = {
        ImageButton(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}