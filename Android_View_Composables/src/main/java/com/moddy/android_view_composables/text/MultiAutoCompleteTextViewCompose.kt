package com.moddy.android_view_composables.text

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun MultiAutoCompleteTextViewCompose(
    modifier: Modifier = Modifier,
    config: (MultiAutoCompleteTextView) -> Unit
) {
    AndroidView(factory = {
        MultiAutoCompleteTextView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}