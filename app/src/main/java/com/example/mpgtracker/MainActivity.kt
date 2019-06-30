package com.example.mpgtracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.R.attr.button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newRecord = findViewById<Button>(R.id.newRecord)
        newRecord.setOnClickListener(View.OnClickListener {
            goToNewRecord()
        })
    }
    private fun goToNewRecord() {
        val intent = Intent(this, NewRecord::class.java)
        startActivity(intent)
    }
}
