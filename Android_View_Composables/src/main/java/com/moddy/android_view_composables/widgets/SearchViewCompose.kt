package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun SearchViewCompose(
    modifier: Modifier = Modifier,
    config: (SearchView) -> Unit
) {
    AndroidView(factory = {
        SearchView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}