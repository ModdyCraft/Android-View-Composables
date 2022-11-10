package com.moddy.android_view_composables.text

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun EditTextViewCompose(
    modifier: Modifier = Modifier,
    config: (EditText) -> Unit
) {
    AndroidView(factory = {
        EditText(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}