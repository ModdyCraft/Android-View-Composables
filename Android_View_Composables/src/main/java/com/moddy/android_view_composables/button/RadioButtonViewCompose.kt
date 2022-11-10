package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun RadioButtonViewCompose(
    modifier: Modifier = Modifier,
    config: (RadioButton) -> Unit
) {
    AndroidView(factory = {
        RadioButton(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}