package com.moddy.android_view_composables.text

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun CheckedTextViewCompose(
    modifier: Modifier = Modifier,
    config: (CheckedTextView) -> Unit
) {
    AndroidView(factory = {
        CheckedTextView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}