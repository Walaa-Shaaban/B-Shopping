package com.ecommerce.b_shopping.presenter.ui.main_new_activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ecommerce.b_shopping.R

class MainNewAdapter(mainNewActivity: MainNewActivity, context: Context) :RecyclerView.Adapter<MainNewAdapter.ViewHolder>() {

    private lateinit var mGetMainNewActivity: MainNewActivity
    private lateinit var mContext: Context

    init {
        mGetMainNewActivity = mainNewActivity
        mContext = context

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(mContext).inflate(R.layout.main_new_item, parent, false)
        return ViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}
