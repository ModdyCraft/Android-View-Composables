package com.moddy.android_view_composables.button

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun RadioGroupViewCompose(
    modifier: Modifier = Modifier,
    config: (RadioGroup) -> Unit
) {
    AndroidView(factory = {
        RadioGroup(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}