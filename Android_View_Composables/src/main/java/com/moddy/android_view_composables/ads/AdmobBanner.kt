package com.moddy.android_view_composables.ads

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

@Composable
fun AdmobBanner(
    modifier: Modifier = Modifier,
    adUnitId: String,
    adSize: AdSize,
    config: (AdView) -> Unit = {},
) {
    AndroidView(
        factory = {
        AdView(it).apply {
            this.setAdSize(adSize)
            this.adUnitId = adUnitId
            config(this)
        }

    },
    modifier =  modifier
    )
}