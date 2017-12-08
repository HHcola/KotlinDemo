package com.kotlindemo.kotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by timothyhe on 2017/12/8.
 */
class KotlinListAdapter(private val items: List<String>) :
        RecyclerView.Adapter<KotlinListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
            = ViewHolder(TextView(parent.context))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = 0

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}