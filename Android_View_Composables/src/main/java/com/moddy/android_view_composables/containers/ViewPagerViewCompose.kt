package com.moddy.android_view_composables.containers

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.viewpager.widget.ViewPager

@Composable
fun ViewPagerViewCompose(
    modifier: Modifier = Modifier,
    config: (ViewPager) -> Unit
) {
    AndroidView(factory = {
        ViewPager(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}