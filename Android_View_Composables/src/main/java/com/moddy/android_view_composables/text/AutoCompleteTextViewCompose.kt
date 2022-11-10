package com.moddy.android_view_composables.text

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun AutoCompleteViewCompose(
    modifier: Modifier = Modifier,
    config: (AutoCompleteTextView) -> Unit
) {
    AndroidView(factory = {
        AutoCompleteTextView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}