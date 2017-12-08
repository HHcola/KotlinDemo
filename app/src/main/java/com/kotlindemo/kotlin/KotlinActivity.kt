package com.kotlindemo.kotlin

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kotlindemo.R
import com.kotlindemo.kotlin.visibilitymodifiers.Person
import java.util.*
import kotlin.collections.ArrayList

class KotlinActivity : Activity() {

    // ? 表示可为空
    // 变量名：类型
    // override、fun：关键字
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        init()
    }


    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    private var personList : ArrayList<Person> = ArrayList()


    private fun init() {
        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
//        forecastList.adapter = KotlinListAdapter(items)
        setData()
        forecastList.adapter = KotlinPersonListAdapter(personList!!)
    }

    private fun setData() = (0..10).forEach {
        var person = Person("xiaoming$it")
        var ra = Random()
        person.age = it + 10
        person.height = 160 + it * 2
        person.sex = if (it % 2 == 0) 1 else 2
        person.idcard = it.toString()
        personList.add(person)
    }
}

