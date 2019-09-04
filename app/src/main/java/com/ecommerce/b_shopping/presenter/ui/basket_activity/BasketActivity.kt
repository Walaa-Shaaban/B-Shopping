package com.ecommerce.b_shopping.presenter.ui.basket_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ecommerce.b_shopping.R
import com.ecommerce.b_shopping.presenter.ui.splash_activity.SplashFragment

class BasketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_basket, BasketFragment())
            .commitAllowingStateLoss()
    }
}
