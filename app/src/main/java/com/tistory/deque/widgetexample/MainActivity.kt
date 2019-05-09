package com.tistory.deque.widgetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Conflict test 3
        setContentView(R.layout.activity_main)
    }
}
