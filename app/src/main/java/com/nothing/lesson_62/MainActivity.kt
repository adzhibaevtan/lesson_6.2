package com.nothing.lesson_62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.nothing.lesson_62.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClicker()
    }

    private val list : MutableList<String> = arrayListOf()

private fun initClicker() {
    with(binding)  {
        btnAdd.setOnClickListener {
            list.add(ediText.text.toString())
        }
        btnPrint.setOnClickListener {
            textView.setText(list.toString()).toString()
        }
    }



}
}