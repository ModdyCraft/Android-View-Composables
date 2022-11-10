package com.moddy.android_view_composables.containers

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.recyclerview.widget.RecyclerView

@Composable
fun RecyclerViewCompose(
    modifier: Modifier = Modifier,
    config: (RecyclerView) -> Unit
) {
    AndroidView(factory = {
        RecyclerView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}