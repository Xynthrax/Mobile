package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun addRow(version: String, name: String) {
        val tableRow = TableRow(applicationContext)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams

        val columnOne = TextView(this)
        columnOne.text = version
        columnOne.width = 500

        val columnTwo = TextView(this)
        columnTwo.text = name
        columnTwo.width = 500

        tableRow.addView(columnOne)
        tableRow.addView(columnTwo)
        tableRow.setPadding(10, 10, 10, 10)

        table1.addView(tableRow)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRow("Version", "Code Name")
        addRow("Android 9.0", "Pie")
        addRow("Android 8.0", "Oreo")

        button1.setOnClickListener {
            addRow(editTextVersion.text.toString(), editTextName.text.toString())
            editTextName.text.clear()
            editTextVersion.text.clear()
        }
    }


}