package com.ecommerce.b_shopping.presenter.ui.splash_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ecommerce.b_shopping.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,SplashFragment())
            .commitAllowingStateLoss()
    }
}
