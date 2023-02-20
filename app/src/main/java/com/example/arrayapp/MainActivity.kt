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
            in bad -> badArray.add("Плохие оценки: Ученик: ${nameArray[index]} – ${gradeArray[index]}")
            in normal -> normalArray.add("Нормальные оценки: Ученик: ${nameArray[index]} – ${gradeArray[index]}")
            in nice -> niceArray.add("Хорошие оценки: Ученик: ${nameArray[index]} – ${gradeArray[index]}")
            in excellent -> excellentArray.add("Отличные оценки: Ученик: ${nameArray[index]} – ${gradeArray[index]}")
            }
        }
        badArray.forEach{Log.e("BAD", "$it")}
        normalArray.forEach{Log.e("BAD", "$it")}
        niceArray.forEach{Log.e("BAD", "$it")}
        excellentArray.forEach{Log.e("BAD", "$it")}
    }
}