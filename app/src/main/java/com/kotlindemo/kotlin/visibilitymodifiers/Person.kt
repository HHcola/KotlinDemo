package com.kotlindemo.kotlin.visibilitymodifiers

/**
 * Created by timothyhe on 2017/12/8.
 */
// kotlin的文件名和类并没有一一对应的关系

class Person constructor(name:String) {
    var name:String = name
    var age:Int = 0
    var height:Int = 180
    var sex:Int = 1
    var idcard:String? = "xxxx"

    init {
            print("name is $name")
        }

    fun canGoSchool() : Boolean = age >= 3

    // ? 表示可以为null，
    // ?.表示非空时执行，否则直接返回null
    fun isSpecialPersion() : Boolean? = idcard?.equals("special")
}