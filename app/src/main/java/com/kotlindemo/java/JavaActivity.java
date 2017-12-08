package com.kotlindemo.java;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kotlindemo.R;
import com.kotlindemo.java.visibilitymodifiers.JavaPerson;

import java.util.ArrayList;
import java.util.List;

public class JavaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        init();
    }


    private List<JavaPerson> mListData = new ArrayList<>();
    private String items[] = {
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    };

    private void init() {
        RecyclerView recyclerView =  findViewById(R.id.java_forecast_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new JavaListAdapter(items));

        setData();
        recyclerView.setAdapter(new JavaPersonListAdapter(mListData));
    }

    private void setData() {
        for(int it = 0; it < 10; it ++) {
            JavaPerson person = new JavaPerson("java" + it);
            person.age = it + 10;
            person.height = 160 + it * 2;
            person.sex = (it % 2 == 0) ? 1 : 2;
            person.idcard = String.valueOf(it);
            mListData.add(person);
        }
    }
}
