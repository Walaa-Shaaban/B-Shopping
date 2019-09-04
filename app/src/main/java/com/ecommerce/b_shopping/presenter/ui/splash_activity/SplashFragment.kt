package com.ecommerce.b_shopping.presenter.ui.splash_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ecommerce.b_shopping.R
import android.content.Intent
import com.ecommerce.b_shopping.presenter.ui.main_new_activity.MainNewActivity


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val timer = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(3000)
                } catch (e: InterruptedException) {
                    // TODO Auto-generated catch block
                    e.printStackTrace()
                } finally {
                    val intent = Intent(activity, MainNewActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        timer.start()

    }




}
