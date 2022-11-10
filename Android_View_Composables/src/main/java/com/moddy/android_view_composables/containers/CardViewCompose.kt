package com.moddy.android_view_composables.containers

import androidx.cardview.widget.CardView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun CardViewCompose(
    modifier: Modifier = Modifier,
    config: (CardView) -> Unit
) {
    AndroidView(factory = {
        CardView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}