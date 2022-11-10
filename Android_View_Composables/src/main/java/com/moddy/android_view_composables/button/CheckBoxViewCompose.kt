package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun CheckBoxViewCompose(
    modifier: Modifier = Modifier,
    config: (CheckBox) -> Unit
) {
    AndroidView(factory = {
        CheckBox(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}