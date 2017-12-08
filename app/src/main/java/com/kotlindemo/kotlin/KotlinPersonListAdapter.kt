package com.kotlindemo.kotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kotlindemo.R
import com.kotlindemo.kotlin.visibilitymodifiers.Person

/**
 * Created by timothyhe on 2017/12/8.
 */

class KotlinPersonListAdapter (private val mListItem : List<Person>) :
        RecyclerView.Adapter<KotlinPersonListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
            holder.bind(mListItem[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KotlinPersonListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, null)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int = mListItem.size

    override fun getItemViewType(position: Int): Int = 0


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var name:TextView = view.findViewById(R.id.name)
        private var age :TextView = view.findViewById(R.id.age)
        private var sex : TextView  = view.findViewById(R.id.sex)
        private var height : TextView = view.findViewById(R.id.height)
        private var idcard : TextView = view.findViewById(R.id.idcard)

        fun bind(person :Person) {
            name.text = person.name
            age.text = person.age.toString()
            sex.text = person.sex.toString()
            height.text = person.height?.toString()
            idcard.text = person.idcard
        }
    }
}


