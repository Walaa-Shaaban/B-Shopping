package com.ecommerce.b_shopping.presenter.ui.products_activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ecommerce.b_shopping.R
import com.ecommerce.b_shopping.presenter.ui.main_new_activity.MainNewActivity


class ProductsAdapter(mainNewActivity: MainNewActivity, context: Context) :  RecyclerView.Adapter<ProductsAdapter.ViewHolder>(){

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


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}