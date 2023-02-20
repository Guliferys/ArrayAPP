package com.example.arrayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.viewmodel.CreationExtras

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bad = 1..4
        val normal = 5..6
        val nice = 7..8
        val excellent = 9..10

        val gradeArray = resources.getIntArray(R.array.gradeArray)
        val nameArray = resources.getStringArray(R.array.nameArray)

        val badArray = ArrayList<String>()
        val normalArray = ArrayList<String>()
        val niceArray = ArrayList<String>()
        val excellentArray = ArrayList<String>()

        for ((index, item) in gradeArray.withIndex()) {
            when (item){
            in bad -> badArray.add("Bad grade: Student: ${nameArray[index]} – ${gradeArray[index]}")
            in normal -> normalArray.add("Normal grade: Student: ${nameArray[index]} – ${gradeArray[index]}")
            in nice -> niceArray.add("Nice grade: Student: ${nameArray[index]} – ${gradeArray[index]}")
            in excellent -> excellentArray.add("Excellent grade: Student: ${nameArray[index]} – ${gradeArray[index]}")
            }
        }
        badArray.forEach{Log.e("myLog", "$it")}
        normalArray.forEach{Log.e("myLog", "$it")}
        niceArray.forEach{Log.e("myLog", "$it")}
        excellentArray.forEach{Log.e("myLog", "$it")}
    }
}