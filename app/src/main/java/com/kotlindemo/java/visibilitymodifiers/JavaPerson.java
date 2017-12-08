package com.kotlindemo.java.visibilitymodifiers;

import android.text.TextUtils;

/**
 * Created by timothyhe on 2017/12/8.
 */

// 文件名即类名
public class JavaPerson {
    private static final String TAG = "JavaPerson";
    public String name;
    public int age;
    public int sex;
    public int height;
    public String idcard;
    public JavaPerson(String name) {
        this.name = name;
    }

    public boolean canGoSchool() {
        return age >= 3;
    }

    public boolean isSpecialPersion() {
        if (!TextUtils.isEmpty(idcard)) {
            return idcard.equals("special");
        }
        return false;
    }
}
