package com.moddy.android_view_composables.text

import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun TextViewCompose(
    modifier: Modifier = Modifier,
    config: (TextView) -> Unit
) {
    AndroidView(factory = {
        TextView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}