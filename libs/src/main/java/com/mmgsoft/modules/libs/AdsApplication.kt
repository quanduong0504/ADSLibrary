package com.mmgsoft.modules.libs

import android.app.Application
import com.mmgsoft.modules.libs.ads.AdsManager

abstract class AdsApplication : Application() {
    val adsManager by lazy {
        AdsManager().initAdsManager(this, testDevices.toMutableList())
    }

    abstract val testDevices: List<String>
}