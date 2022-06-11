# ADSLibrary
```diff
@@Base Module Tutorial@@:
1. ADS
  - Base Abtract AdsApplication
  - Use func ((AdsApplication) getApplicationContext()).getAdsManager().forceShowInterstitial(Activity.this, AdsUnitString, () -> { }
 
          <com.mmgsoft.modules.libs.widgets.BannerAds
            android:id="@+id/banner_ads"
            android:layout_alignParentBottom="true"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:ba_adsUnitId="@string/banner_ad_unit_id"
            app:ba_autoLoad="true"/>
  - ba_autoLoad:
    - true: auto load banner ads
    - false: non auto

2. PurchaseView

        <com.mmgsoft.modules.libs.widgets.PurchaseView
          android:id="@+id/purchaseView"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          android:background="#BFBFBF"
          app:pv_layoutManager="list"
          app:pv_orientation="vertical" />
  - pv_layoutManager (list/grid)
  - pv_orientation (vertical/horizontal)
  - pv_spanCount (like spanCount GridLayoutManager)

3. Purchase Activity
+ static function _open()

        open(ctx: Context,
                 theme: ActionBarTheme,
                 @ColorRes colorToolbar: Int?,
                 @ColorRes colorTitleToolbar: Int?,
                 @LayoutRes layoutSubs: Int,
                 @LayoutRes layoutInApp: Int,
                 headerTitle: String?)
                 
         open(ctx: Context,
                 @LayoutRes layoutSubs: Int,
                 @LayoutRes layoutInApp: Int,
                 headerTitle: String)
                 
         open(ctx: Context,
                 theme: ActionBarTheme,
                 @ColorRes colorHeader: Int,
                 @ColorRes colorTitle: Int,
                 @LayoutRes layoutSubs: Int,
                 @LayoutRes layoutInApp: Int)
                 
          open(ctx: Context, headerTitle: String)
          
          open(ctx: Context, theme: ActionBarTheme, @ColorRes colorHeader: Int, @ColorRes colorTitle: Int)
          
+ theme: text color in actionbar
+ colorToolbar/colorHeader : toolbar background color
+ colorTitleToolbar/colorTitle : title text color
+ layoutSubs: resLayoutID with subs type
+ layoutInApp: resLayoutID with inApp type
```
