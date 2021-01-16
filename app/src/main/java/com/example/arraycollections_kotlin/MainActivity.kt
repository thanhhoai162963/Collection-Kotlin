package com.example.arraycollections_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = mutableListOf(1,3,5,7)

        var array = arrayOf(4,5,6,7)
        var arrayList =  arrayListOf(1,3,5)
        var set = mutableSetOf(1,1,1,2)
        var map =  mutableMapOf<String,Int>(
                "a" to 1,
                "b" to 2
        )
        var change = set.map { it + 2 }.filter { it > 0 }
        var map1 = map.filterKeys { it == "a"}
        Log.d("bbb","$map1")

    }
}
 
