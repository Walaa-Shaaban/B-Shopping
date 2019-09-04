package com.ecommerce.b_shopping.presenter.ui.payment_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ecommerce.b_shopping.R
import com.ecommerce.b_shopping.presenter.ui.splash_activity.SplashFragment

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_payment, PaymentFragment())
            .commitAllowingStateLoss()
    }
}
