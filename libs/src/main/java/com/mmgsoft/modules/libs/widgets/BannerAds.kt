package com.mmgsoft.modules.libs.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.mmgsoft.modules.libs.R
import com.mmgsoft.modules.libs.ads.AdsManager

class BannerAds @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    private var adsUnitId: String? = null
    private var isAutoLoad = false

    init {
        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.BannerAds)
        adsUnitId = typeArray.getString(R.styleable.BannerAds_ba_adsUnitId)
        isAutoLoad = typeArray.getBoolean(R.styleable.BannerAds_ba_autoLoad, false)
        typeArray.recycle()
        View.inflate(context, R.layout.view_banner_ads, this)
        initViews()
    }

    private fun initViews() {
        if(!adsUnitId.isNullOrBlank() && isAutoLoad) {
            loadBanner(adsUnitId!!)
        }
    }

    fun load(adsUnitId: String) {
        if(!isAutoLoad) loadBanner(adsUnitId)
    }

    private fun loadBanner(adsUnitId: String) {
        AdsManager().showAdModBanner(context, adsUnitId, findViewById(R.id.bannerContainer), findViewById(R.id.shimmerContainerBanner))
    }
}