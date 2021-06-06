package com.example.assignment1cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var enum = findViewById<EditText>(R.id.etnum)
        val enum2 = findViewById<EditText>(R.id.etnum2)
        val etadd = findViewById<Button>(R.id.etadd)
        val etmulti = findViewById<Button>(R.id.etmulti)
        val etsub = findViewById<Button>(R.id.etsub)
        val etmodule = findViewById<Button>(R.id.etmodule)
        val etclear = findViewById<Button>(R.id.etclear)


        etadd.setOnClickListener {
            val input1 = enum.text.toString().trim()
            val input2 = enum2.text.toString().trim()
            val add = input1 + input2


        }
        etsub.setOnClickListener {
            val input1 = enum.text.toString().trim()
            val input2 = enum2.text.toString().trim()
            val subtract = input1.toInt() - input2.toInt()


        }
        etmulti.setOnClickListener {
            val input1 = enum.text.toString().trim()
            val input2 = enum2.text.toString().trim()
            val multiply = input1.toInt() * input2.toInt()

        }
        etmodule.setOnClickListener {
            val input1 = enum.text.toString().trim()
            val input2 = enum2.text.toString().trim()
            val division = input1.toInt() % input2.toInt()



            etclear.setOnClickListener {
                val input1 = enum.text.toString().trim()
                val input2 = enum2.text.toString().trim()
                val division = input1.toInt() % input2.toInt()

            }

        }
    }
}















