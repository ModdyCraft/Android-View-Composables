package com.moddy.android_view_composables.ads

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.moddy.android_view_composables.vars.AdBannerSize

@Composable
fun AdmobBanner(
    modifier: Modifier = Modifier,
    adUnitId: String,
    adSize: AdBannerSize,
    config: (AdView) -> Unit = {},
) {
    val mapAD = hashMapOf<AdBannerSize, AdSize>(
        AdBannerSize.BANNER to AdSize.BANNER,
        AdBannerSize.FULL_BANNER to AdSize.FULL_BANNER,
        AdBannerSize.LARGE_BANNER to AdSize.LARGE_BANNER,
        AdBannerSize.SMART_BANNER to AdSize.SMART_BANNER,
        AdBannerSize.FLUID to AdSize.FLUID,
        AdBannerSize.INVALID to AdSize.INVALID,
        AdBannerSize.LEADERBOARD to AdSize.LEADERBOARD,
        AdBannerSize.MEDIUM_RECTANGLE to AdSize.MEDIUM_RECTANGLE,
        AdBannerSize.SEARCH to AdSize.SEARCH,
        AdBannerSize.WIDE_SKYSCRAPER to AdSize.WIDE_SKYSCRAPER,
        AdBannerSize.zza to AdSize.zza
    )

    ADVIEWC(adSize = mapAD[adSize], adUnitId = adUnitId, config = {config(it)}, modifier = modifier)
}

@Composable
private fun ADVIEWC(adSize: AdSize?, adUnitId: String, config: (AdView) -> Unit, modifier: Modifier = Modifier) {
    AndroidView(
        factory = {
            AdView(it).apply {
                if (adSize != null) {
                    this.setAdSize(adSize)
                }
                this.adUnitId = adUnitId
                config(this)
            }
        },
        modifier =  modifier
    )
}