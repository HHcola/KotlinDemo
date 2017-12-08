package com.kotlindemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kotlindemo.java.JavaActivity;
import com.kotlindemo.kotlin.KotlinActivity;

public class MainActivity extends Activity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.btn_kotlin).setOnClickListener(this);
        findViewById(R.id.btn_java).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_kotlin) {
            onClickKotlin();
        } else if (view.getId() == R.id.btn_java) {
            onClickJava();
        }
    }

    private void onClickKotlin() {
        Intent intent = new Intent(this, KotlinActivity.class);
        startActivity(intent);
    }

    private void onClickJava() {
        Intent intent = new Intent(this, JavaActivity.class);
        startActivity(intent);
    }
}
