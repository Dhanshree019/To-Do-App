package com.dhanshree.todo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      <-------- Show current data on home page ---------->
        var current_date : TextView = findViewById(R.id.current_date_txt)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("EEE, MMM d")
        val formatted = current.format(formatter)
        current_date.setText(formatted)




    }
}