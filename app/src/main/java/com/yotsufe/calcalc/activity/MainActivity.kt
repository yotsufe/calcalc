package com.yotsufe.calcalc.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.yotsufe.calcalc.R
import com.yotsufe.calcalc.adapter.TabAdapter
import com.yotsufe.calcalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        settingAds()

        createTab()
    }

    /**
     * 広告設定
     */
    private fun settingAds() {
        MobileAds.initialize(this)
        binding.adView.loadAd(AdRequest.Builder().build())
    }

    /**
     * タブ生成
     */
    private fun createTab() {
        binding.pager.adapter = TabAdapter(supportFragmentManager, this)
        binding.tabs.setupWithViewPager(binding.pager)
    }
}
