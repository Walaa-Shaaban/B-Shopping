package com.ecommerce.b_shopping.presenter.ui.details_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ecommerce.b_shopping.R
import com.ecommerce.b_shopping.presenter.ui.splash_activity.SplashFragment

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_details, DetailsFragment())
            .commitAllowingStateLoss()
    }
}
