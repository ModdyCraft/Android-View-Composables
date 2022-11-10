package com.moddy.android_view_composables.widgets

import android.widget.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun CalendarViewCompose(
    modifier: Modifier = Modifier,
    config: (CalendarView) -> Unit
) {
    AndroidView(factory = {
        CalendarView(it).apply {
            config(this)
        }
    },
        modifier = modifier
    )
}