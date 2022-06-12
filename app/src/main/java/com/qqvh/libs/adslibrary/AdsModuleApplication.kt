package com.qqvh.libs.adslibrary

import com.mmgsoft.modules.libs.AdsApplication
import com.mmgsoft.modules.libs.helpers.StateAfterBuy

class AdsModuleApplication : AdsApplication() {
    override val testDevices: List<String>
        get() = listOf()

    override val prodInAppIds: List<String>
        get() = listOf()

    override val prodSubsIds: List<String>
        get() = listOf()

    override fun onCreated() {

    }

    override fun getStateBilling(): StateAfterBuy {
        return StateAfterBuy.DISABLE
    }
}