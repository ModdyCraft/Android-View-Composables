package com.moddy.android_view_composables.widgets

import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewCompose(
    modifier: Modifier = Modifier,
    config: (WebView) -> Unit
) {
    AndroidView(factory = {
        WebView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}