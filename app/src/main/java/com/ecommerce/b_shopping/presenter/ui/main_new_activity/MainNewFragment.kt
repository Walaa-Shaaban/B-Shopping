package com.ecommerce.b_shopping.presenter.ui.main_new_activity

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ecommerce.b_shopping.R

class MainNewFragment : Fragment() {

    companion object {
        fun newInstance() = MainNewFragment()
    }

    private lateinit var viewModel: MainNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_new_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainNewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
